package literature;

import jdk.jfr.StackTrace;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Runner {
    /* TODO FIRST OF ALL: set the level of verbosity (how much output).
            Hint: start by making it print a lot so you can see what's happening
                  and when. The debugger won't necessarily help you see when
                  some of the early stages are executed.
   */
    public static final Verbosity VERBOSE = Verbosity.VERBOSE;

    public static final String LOG_PREFIX = "Log: ";

    public static final int JDK_MINIMUM = 11;

    private static final boolean[] PRELIMINARY_CHECKS =
            new boolean[]{
                    checksPassed()
            };

    /* TODO PRELIMINARY_CHECKS_PASSED uses several advanced features of Java
            as short-hand for collapsing an array of boolean values,
            whose length isn't explicitly specified, into a single result.
            There is NO requirement to be able to write this nor even
            to understand how this works. But it is here for your further study
            if you are interested. Look at the official Oracle java
            documentation for lambda expressions (the -> symbol), IntStream,
            and filtering (in this case allMatch).
    */
    private static final boolean PRELIMINARY_CHECKS_PASSED =
            IntStream.range(0, PRELIMINARY_CHECKS.length)
                     .allMatch(i -> PRELIMINARY_CHECKS[i]);

    private static String[] args;


    private static String getCallingMethodName() {
        final int INDEX_OF_CALLING = 0;
        StackTraceElement[] stackTraceElements =
                (new Throwable()).getStackTrace();
        return stackTraceElements[INDEX_OF_CALLING].getMethodName();
        /* TODO 1: examine the StackTrace from a Throwable
                2: get the name of the method you want
                   hint: it is not at the end of the stack
                3: define a suitable constant for the offset
                4: return the name of the method
        */
//        return "TODO: find the name of the method in the StackTrace";
    }

    private static void log(boolean ok) {
        if (VERBOSE.isVerbose()) {
            System.out.printf("%s%s: %S%n", LOG_PREFIX,
                    getCallingMethodName(), ok);
        }
    }

    private static int getJavaVersion() {
        String version = System.getProperty("java.version");
        boolean dot = true;
        for (int i = 0; i < version.length(); i++) {
            if (version.charAt(i) == '.') {
                version = version.substring(0,i);
                break;
            }
        }
        return Integer.parseInt(version);
    }

    private static boolean jdkAcceptable() {
        boolean ok = false;
        if (getJavaVersion() >= 11) {
            ok = true;
        }
        return ok;
    }

    private static boolean argsLengthOK(String[] args) {
        boolean ok = false;
        try {
            if (args.length > 0) {
                ok = true;
            }
        }
        catch (Exception ignored) {
        }
        log(ok);
        return ok;

    }

    private static boolean fileOK(String filename) {
        boolean ok = true;
        try (
                final FileInputStream fis =
                        new FileInputStream("C:\\Users\\joeok\\OneDrive\\" +
                                "Documents\\Assignment 3\\Assignment3Part1\\input\\" + filename)
        ) {
            int ignored = fis.read(); // check file is not empty by reading something
        } catch ( IOException e ) {
            ok = false;
        }

        return ok;
    }

    private static boolean checksPassed() {
        if (argsLengthOK(args) && jdkAcceptable()) {
            return true;
        }

        return false;
    }


    public static void main(String[] clArgs) {
        args = clArgs;
        for (String s: args) {
            System.out.println(s);
        }
        // TODO double check
        System.out.println(checksPassed());
        System.out.println(fileOK("01-one-word-per-line.txt"));
        if (checksPassed() && fileOK("01-one-word-per-line.txt")) {
            System.out.println("Good to go");
        }
        /* TODO Enclose this line:
                System.out.println("Good to go");
                so that both sets of checks are passed first.
                Note: that's two *sets* of checks, not just two individual checks.
        */
        /* TODO Once everything is (more or less working) change from
                VerbositySimple to Verbosity and see how making use of Verbosity's
                different levels and its isVerbose() method can help readability
                in your code. Think about how enums or booleans can be used in
                the readability of code especially with respect to parameters
                and conditions.
        */
        DataStructure1 wordList = new DataStructure1(args);
        System.out.println(DataStructure1.getNumberOfOccurrences("hello"));
        System.out.println(Arrays.toString(args));
    }
}
