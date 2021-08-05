package concurrency.optimizingLatency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Marcin Beda.
 */

public class Application {

    private static PathManager pathManager = new PathManager();
    private static PersonalDataService personalDataService = new PersonalDataService();

    public static void main(String[] args) {

        List<String> fileNames = Arrays.asList("exampleData1.txt", "exampleData2.txt", "exampleData3.txt", "exampleData4.txt");

        long start = System.currentTimeMillis();
        CalculatedPersonalDataDto dto = multiThread(fileNames);
        long end = System.currentTimeMillis();
        long latency = end - start;
        System.out.println("latency: " + latency);
        System.out.println(dto);
    }

    // For the 12 file set score is
    // 2 threads - 1300-1500 ms
    // 3 threads - 1150-1400 ms
    // 4 threads < 1000 ms
    // In this example is only 4 file, not 12
    public static CalculatedPersonalDataDto multiThread(List<String> fileNames) {
        CalculatedPersonalDataDto dto = new CalculatedPersonalDataDto();
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<CalculatedPersonalDataDto> result1 = service.submit(() -> singleThread(fileNames.subList(0, 1)));
        Future<CalculatedPersonalDataDto> result2 = service.submit(() -> singleThread(fileNames.subList(2, 3)));

        try {
            dto.add(result1.get());
            dto.add(result2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return dto;
    }

    // For the 12 file set score is
    // 1 thread - 2100-2200 ms
    // In this example is only 4 file, not 12
    public static CalculatedPersonalDataDto singleThread(List<String> fileNames) {
        CalculatedPersonalDataDto dto = new CalculatedPersonalDataDto();
        for (String fileName : fileNames) {
            dto.add(personalDataService.getCalculatedPersonalData(pathManager.createAbsoluteResourceFilePath(fileName)));
        }
        return dto;
    }
}
