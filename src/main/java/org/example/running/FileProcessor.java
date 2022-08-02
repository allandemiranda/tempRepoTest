package org.example.running;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * 7. FileProcessor
 */

/**
 * A given module of the application contains a feature that is responsible for processing a csv file. Basically, this
 * processing reads some columns of each line of the file and then write the data in other files. Now the business team
 * asked us to perform some filtering in the data that is read from the csv file before outputting it to the final
 * files. Basically, the initial requirement states that, for each row, if the value of the column 3 is found in another
 * file (c:\invalid_data.csv), then the line should be skipped. Your task is to write a code that implements this
 * requirement. Your solution should follow good coding practices (clean code, SOLID, etc.). Also keep in mind that in
 * the future more requirements could be added to this feature. For example: the business team could ask us to consider
 * multiple columns in the filter, or even add a completely different filter logic that uses a computation based on
 * values from the current line. So, your code should be extensible, should support adding/removing filters, should
 * support evaluation of multiple filter for the same line, etc. Unit tests are mandatory.
 */

/**
 * Sample data in the source csv file:
 * 9004A;Lorem ipsum dolor;A85;1000.125547;8524;-1411.1;Lorem ipsum
 * 8014CD;Lorem ipsum dolor;B02;2000.125547;5524;-5551.1;Lorem ipsum
 * 000014A;Lorem ipsum dolor;C001;85250.12555;8524;8914.41;Lorem ipsum
 * 080044Z;Lorem ipsum dolor;B01;8251.155;854;894.47;Lorem ipsum
 */

/**
 * Sample data in the invalid_data.csv file:
 * B01
 * B02
 * B03
 * A
 * AHUS58518SDSFWEEA85005
 */

/**
 * Expected output for the input above:
 * 9004A;Lorem ipsum dolor;A85;1000.125547;8524;-1411.1;Lorem ipsum
 * 000014A;Lorem ipsum dolor;C001;85250.12555;8524;8914.41;Lorem ipsum
 */

public class FileProcessor {

  private final Path source;

  public FileProcessor(Path source) {
    this.source = source;
  }

  public void process() throws IOException {
    FileConsumerFactory fileConsumerFactory = new FileConsumerFactory();
    try (Stream<String> stream = Files.lines(source)) {
      stream.forEach(line -> {
        //One option is to add some logic around this part of the code to skip the lines based on the
        //requirements, but feel free to add the logic wherever you think it the best location
        FileConsumer fileConsumer = fileConsumerFactory.createFileConsumer(line);
        fileConsumer.consume(line);
      });
    }
  }

  static class FileConsumerFactory {

    FileConsumer createFileConsumer(String line) {
      //Some logic here to create a valid file consumer.
      //For this example it only return a Default File Consumer
      //You don’t need to care about this method.
      return new DefaultFileConsumer();
    }
  }

  interface FileConsumer {

    void consume(String line);
  }

  static class DefaultFileConsumer implements FileConsumer {

    @Override
    public void consume(String line) {
      //Some code is done here, but it is not important for this exercise
    }
  }
}

