package ir.sleepycat.cipher;


import ir.sleepycat.cipher.cli.CommandLine;
import ir.sleepycat.cipher.gui.GuiApplication;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("--gui")) {
            GuiApplication.runGui(args);
        }
        CommandLine.runCli(args);
    }
}