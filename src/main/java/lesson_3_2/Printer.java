/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_3_2;

/**
 *
 * @author a.lemeshchuk
 */
public class Printer {

    public static void main(String[] args) {
        Printer print = new Printer("Sony", "9", true, "New");
        print.getSpecs();
        print.fillUp(99, "black");
        print.fillUp(99, "yellow");
        print.print(101, "yellow", true);
    }

    private int tonerVolume;
    private int pages;
    private boolean isDuplex;
    private String color;
    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private int tonerLevelBlack;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int printedPages;

    public Printer(String manufacturer, String model, boolean isColor, String type) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.isColor = isColor;
        this.type = type;
    }

    public void getSpecs() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Supports color: " + (isColor ? "YES" : "NO"));
    }

    public void fillUp(int tonerVolume, String color) {
        if (isColor == true) {
            switch (color) {
                case "black":
                    this.tonerLevelBlack = tonerVolume;
                    break;
                case "magenta":
                    this.tonerLevelMagenta = tonerVolume;
                    break;
                case "yellow":
                    this.tonerLevelYellow = tonerVolume;
                    break;
                case "blue":
                    this.tonerLevelBlue = tonerVolume;
                    break;
                default:
                    this.tonerVolume = tonerVolume;
                    break;
            }
        } else {
            switch (color) {
                case "black":
                    this.tonerLevelBlack = tonerVolume;
                    break;
                default:
                    System.out.println("This printer does not support color");
                    break;
            }
        }

    }

    public void print(int pages, String color, boolean isDuplex) {
        int duplexPages;
        boolean readyToPrint = false;
        int volume = 0;

        if (pages % 2 == 0) {
            duplexPages = pages / 2;
        } else {
            duplexPages = (pages / 2) + 1;
        }

        if (color != "black" && isColor == false) {
            readyToPrint = false;
            System.out.println("Printer does not support color");
        } else {
            switch (color) {
                case "black":
                    readyToPrint = this.tonerLevelBlack != 0;
                    if (readyToPrint == false) {
                        System.out.println("black cartridge is empty");
                    } else {
                        volume = tonerLevelBlack;
                    }
                    break;
                case "magenta":
                    readyToPrint = this.tonerLevelMagenta != 0;
                    if (readyToPrint == false) {
                        System.out.println("magenta cartridge is empty");
                    } else {
                        volume = tonerLevelMagenta;
                    }
                    break;
                case "yellow":
                    readyToPrint = this.tonerLevelYellow != 0;
                    if (readyToPrint == false) {
                        System.out.println("yellow cartridge is empty");
                    } else {
                        volume = tonerLevelYellow;
                    }
                    break;
                case "blue":
                    readyToPrint = this.tonerLevelBlue != 0;
                    if (readyToPrint == false) {
                        System.out.println("blue cartridge is empty");
                    } else {
                        volume = tonerLevelBlue;
                    }
                    break;
                default:
                    System.out.println("incorrect color selected");
                    break;
            }
        }

        if (isDuplex == true && readyToPrint == true) {
            for (int i = 0; i <= duplexPages; i++) {
                if (volume > 0) {
                    System.out.println("Page " + i + " printed");
                    volume -= 2;
                } else if (volume < 0) {
                    System.out.println("cartridge is empty");
                    break;
                }
            }
        } else if (readyToPrint == true) {
            for (int i = 0; i <= pages; i++) {
                if (volume > 0) {
                    System.out.println("Page " + i + " printed");
                    volume--;
                } else if (volume < 0) {
                    System.out.println("cartridge is empty");
                }
            }
        }
    }
}
