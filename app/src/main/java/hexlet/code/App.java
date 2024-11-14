package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.IOException;
import java.util.concurrent.Callable;

@Command(name = "gendiff", mixinStandardHelpOptions = true,
        description = "Compares two configuration files and shows a difference.")
public class App {
    @Parameters(index = "0", paramLabel = "filepath1", description = "path to first file")
    private String filepath1;

    @Parameters(index = "1", paramLabel = "filepath2", description = "path to second file")
    private String filepath2;

    @Option(names = {"-f", "--format"},defaultValue = "stylish", description = "output format [default: stylish]")
    private String format;

    @Option(names = {"-h", "--help"}, description = "Show this help message and exit.")
    private String help;

    @Option(names = {"-V", "--version"}, description = "Print version information and exit.")
    private String version;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
