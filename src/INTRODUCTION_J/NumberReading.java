package INTRODUCTION_J;
import java.util.Scanner;

public class NumberReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number (<10.000): ");
        int num = scanner.nextInt();
        int thousand = num / 1000;
        System.out.println("thousand index: " + thousand);
        int hundred = (num - thousand * 1000) / 100;
        System.out.println("hundred index: " + hundred);
        int tensDigit = (num - thousand * 1000 - hundred * 100) / 10;
        System.out.println("tensDigit index: " + tensDigit);
        int unit = num - thousand * 1000 - hundred * 100 - tensDigit * 10;
        System.out.println("unit index: " + unit);


        String thousandRead;
        switch (thousand) {
            case 1: thousandRead = "one";
                break;
            case 2: thousandRead = "two";
                break;
            case 3: thousandRead = "three";
                break;
            case 4: thousandRead = "four";
                break;
            case 5: thousandRead = "five";
                break;
            case 6: thousandRead = "six";
                break;
            case 7: thousandRead = "seven";
                break;
            case 8: thousandRead = "eight";
                break;
            case 9: thousandRead = "nine";
                break;
            default: thousandRead = "";
        }

        String hundredRead;
        switch (hundred) {
            case 1: hundredRead = "one";
                break;
            case 2: hundredRead = "two";
                break;
            case 3: hundredRead = "three";
                break;
            case 4: hundredRead = "four";
                break;
            case 5: hundredRead = "five";
                break;
            case 6: hundredRead = "six";
                break;
            case 7: hundredRead = "seven";
                break;
            case 8: hundredRead = "eight";
                break;
            case 9: hundredRead = "nine";
                break;
            default: hundredRead = "";
        }

        String unitRead;
        switch (unit) {
            case 1: unitRead = "one";
                break;
            case 2: unitRead = "two";
                break;
            case 3: unitRead = "three";
                break;
            case 4: unitRead = "four";
                break;
            case 5: unitRead = "five";
                break;
            case 6: unitRead = "six";
                break;
            case 7: unitRead = "seven";
                break;
            case 8: unitRead = "eight";
                break;
            case 9: unitRead = "nine";
                break;
            default: unitRead = "";

        }


        String tensDigitRead;
        switch (tensDigit) {
            case 2: tensDigitRead = "twenty";
                break;
            case 3: tensDigitRead = "thirty";
                break;
            case 4: tensDigitRead = "forty";
                break;
            case 5: tensDigitRead = "fifty";
                break;
            case 6: tensDigitRead = "sixty";
                break;
            case 7: tensDigitRead = "seventy";
                break;
            case 8: tensDigitRead = "eighty";
                break;
            case 9: tensDigitRead = "ninety";
                break;
            default:tensDigitRead ="";
        }
        if(thousandRead == "")
            if(hundredRead == "")
                if(tensDigitRead =="")
                    if(tensDigit !=0) {
                        if (unit == 0) {
                            unitRead = "ten";
                            System.out.println("The number is: " + unitRead);
                        }
                        else {
                            if (unitRead == "one")
                                tensDigitRead = "eleven";
                            else if (unitRead == "two")
                                tensDigitRead = "twelve";
                            else if (unitRead == "three")
                                tensDigitRead = "thirteen";
                            else if (unitRead == "four")
                                tensDigitRead = "fourteen";
                            else if (unitRead == "five")
                                tensDigitRead = "fifteen";
                            else if (unitRead == "six")
                                tensDigitRead = "sixteen";
                            else if (unitRead == "seven")
                                tensDigitRead = "seventeen";
                            else if (unitRead == "eight")
                                tensDigitRead = "eighteen";
                            else if (unitRead == "nine")
                                tensDigitRead = "nineteen";
                            System.out.println("The number is: " + tensDigitRead);
                        }
                    }
                    else {
                        if(unit == 0)
                            System.out.println("The number is: zero");
                        else
                            System.out.println("The number is: "+ unitRead);
                    }
                else {
                    if(unit == 0){
                        System.out.println("The number is: "+ tensDigitRead);
                    }
                    else {
                        System.out.println("The number is: "+ tensDigitRead + unitRead);
                    }
                }
            else{
                if(tensDigitRead =="")
                    if(tensDigit !=0) {
                        if (unit == 0) {
                            unitRead = "ten";
                            System.out.println("The number is: "+ hundredRead+ " hundred " + unitRead);
                        }
                        else {
                            if (unitRead == "one")
                                tensDigitRead = "eleven";
                            else if (unitRead == "two")
                                tensDigitRead = "twelve";
                            else if (unitRead == "three")
                                tensDigitRead = "thirteen";
                            else if (unitRead == "four")
                                tensDigitRead = "fourteen";
                            else if (unitRead == "five")
                                tensDigitRead = "fifteen";
                            else if (unitRead == "six")
                                tensDigitRead = "sixteen";
                            else if (unitRead == "seven")
                                tensDigitRead = "seventeen";
                            else if (unitRead == "eight")
                                tensDigitRead = "eighteen";
                            else if (unitRead == "nine")
                                tensDigitRead = "nineteen";
                            System.out.println("The number is: "+ hundredRead+ " hundred " + tensDigitRead);
                        }
                    }
                    else {
                        if(unit == 0)
                            System.out.println("The number is:" + hundredRead+ " hundred ");
                        else
                            System.out.println("The number is: "+ hundredRead+ " hundred " + unitRead);
                    }
                else {
                    if(unit == 0){
                        System.out.println("The number is: "+ hundredRead+ " hundred " + tensDigitRead);
                    }
                    else {
                        System.out.println("The number is: "+ hundredRead+ " hundred " + tensDigitRead + unitRead);
                    }
                }
            }
        else {
            if(hundred == 0) {
                if (tensDigitRead == "")
                    if (tensDigit != 0) {
                        if (unit == 0) {
                            unitRead = "ten";
                            System.out.println("The number is: " + thousandRead + " thousand " + unitRead);
                        } else {
                            if (unitRead == "one")
                                tensDigitRead = "eleven";
                            else if (unitRead == "two")
                                tensDigitRead = "twelve";
                            else if (unitRead == "three")
                                tensDigitRead = "thirteen";
                            else if (unitRead == "four")
                                tensDigitRead = "fourteen";
                            else if (unitRead == "five")
                                tensDigitRead = "fifteen";
                            else if (unitRead == "six")
                                tensDigitRead = "sixteen";
                            else if (unitRead == "seven")
                                tensDigitRead = "seventeen";
                            else if (unitRead == "eight")
                                tensDigitRead = "eighteen";
                            else if (unitRead == "nine")
                                tensDigitRead = "nineteen";
                            System.out.println("The number is: " + thousandRead + " thousand " + tensDigitRead);
                        }
                    } else {
                        if (unit == 0)
                            System.out.println("The number is:" + thousandRead + " thousand " );
                        else
                            System.out.println("The number is: " + thousandRead + " thousand " + unitRead);
                    }
                else {
                    if (unit == 0) {
                        System.out.println("The number is: " + thousandRead + " thousand " + tensDigitRead);
                    } else {
                        System.out.println("The number is: " + thousandRead + " thousand " + tensDigitRead + unitRead);
                    }
                }
            }
            else {
                if (tensDigitRead == "")
                    if (tensDigit != 0) {
                        if (unit == 0) {
                            unitRead = "ten";
                            System.out.println("The number is: " + thousandRead + " thousand " + hundredRead + " hundred " + unitRead);
                        } else {
                            if (unitRead == "one")
                                tensDigitRead = "eleven";
                            else if (unitRead == "two")
                                tensDigitRead = "twelve";
                            else if (unitRead == "three")
                                tensDigitRead = "thirteen";
                            else if (unitRead == "four")
                                tensDigitRead = "fourteen";
                            else if (unitRead == "five")
                                tensDigitRead = "fifteen";
                            else if (unitRead == "six")
                                tensDigitRead = "sixteen";
                            else if (unitRead == "seven")
                                tensDigitRead = "seventeen";
                            else if (unitRead == "eight")
                                tensDigitRead = "eighteen";
                            else if (unitRead == "nine")
                                tensDigitRead = "nineteen";
                            System.out.println("The number is: " + thousandRead + " thousand " + hundredRead + " hundred " + tensDigitRead);
                        }
                    } else {
                        if (unit == 0)
                            System.out.println("The number is:" + thousandRead + " thousand " + hundredRead + " hundred ");
                        else
                            System.out.println("The number is: " + thousandRead + " thousand " + hundredRead + " hundred " + unitRead);
                    }
                else {
                    if (unit == 0) {
                        System.out.println("The number is: " + thousandRead + " thousand " + hundredRead + " hundred " + tensDigitRead);
                    } else {
                        System.out.println("The number is: " + thousandRead + " thousand " + hundredRead + " hundred " + tensDigitRead + unitRead);
                    }
                }
            }
        }
    }
}
