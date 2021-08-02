package epam.learning;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {



    // String as array №1


//    public static void main(String[] args) {
//
//        String[] array;
//        String temp;
//
//        array = new String[] {"catVoice", "someStaff", "neverGiveUp"};
//
//        System.out.println("camelCase: \n");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        temp = "";
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length(); j++) {
//                if (array[i].charAt(j) == Character.toUpperCase(array[i].charAt(j))) {
//                    temp = temp.concat("_");
//                    temp = temp.concat(Character.toString(Character.toLowerCase(array[i].charAt(j))));
//                }
//                else {
//                    temp = temp.concat(Character.toString(array[i].charAt(j)));
//                }
//            }
//            array[i] = temp;
//            temp = "";
//        }
//
//        System.out.println("\nsnake_case: \n");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }




    // String as array №2

//    public static void main(String[] args) {
//
//        String basicString;
//        String resultString;
//        char [] array;
//
//        basicString = "please say your word. My word is silly. Many words";
//        resultString = "";
//
//        System.out.println(basicString);
//
//        array = new char[basicString.length()];
//
//        for (int i = 0; i < basicString.length(); i++) {
//            array[i] = basicString.charAt(i);
//        }
//
//        for (int i = 0; i <  array.length; i++) {
//
//            if ( array[i] == 'w' && i < ( array.length - 3) &&  array[i + 1] == 'o'
//                    &&  array[i + 2] == 'r' &&  array[i + 3] == 'd' ) {
//                resultString = resultString.concat("letter");
//                i +=3;
//            } else {
//                resultString = resultString.concat(Character.toString( array[i]));
//            }
//        }
//        System.out.println(resultString);
//    }




    // String as array №3

//    public static void main(String[] args) {
//
//        String string;
//        int counter = 0;
//        char [] array;
//
//        string = "р щшн рр 89 3 дл 89 dj; 3ij 4io o23o 983h4 ";
//
//        System.out.println("String = " + string);
//
//        array = new char[string.length()];
//
//        for (int i = 0; i < string.length(); i++) {
//            array[i] = string.charAt(i);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (Character.getNumericValue(array[i]) >= 0 && Character.getNumericValue(array[i]) <= 9) {
//                counter++;
//            }
//        }
//        System.out.println("count = " + counter);
//    }




    // String as array №4

//    public static void main(String[] args) {
//
//        String string;
//        int counter = 0;
//        char [] array;
//
//        string = "р щшн рр 89 3 дл 89 dj; 3ij 4io o23o 983h4 ";
//
//        System.out.println("String = " + string);
//
//        array = new char[string.length()];
//
//        for (int i = 0; i < string.length(); i++) {
//            array[i] = string.charAt(i);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (Character.getNumericValue(array[i]) >= 0 && Character.getNumericValue(array[i]) <= 9) {
//                counter++;
//                if (i + 1 < array.length && (Character.getNumericValue(array[i + 1]) < 0 || Character.getNumericValue(array[i + 1]) > 9)) {
//                    counter--;
//                }
//            }
//        }
//        System.out.println("count = " + counter);
//    }




    // String as array №5

//    public static void main(String[] args) {
//
//        String basicString;
//        String resultString;
//        char [] array;
//
//        resultString = "";
//        basicString = "  2пробела   3пробела 1пробелИ4пробелаВконце    ";
//
//        System.out.println("String = " + basicString);
//
//        array = new char[basicString.length()];
//
//        for (int i = 0; i < basicString.length(); i++) {
//            array[i] = basicString.charAt(i);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == ' ') {
//
//                while (i + 1 < array.length && array[i + 1] == ' ') {
//                    i++;
//                    }
//                }
//
//            if (resultString.length() == 0 && array[i] == ' ') {
//                i++;
//                resultString = resultString.concat(Character.toString(array[i]));
//            }
//            else if (i == array.length - 1 && array[i] == ' ') {
//                i++;
//            }
//            else {
//                resultString = resultString.concat(Character.toString(array[i]));
//            }
//            }
//        System.out.println("\n" + resultString);
//        }





    //String as String № 1

//    public static void main(String[] args) {
//
//        String string;
//        int length;
//        int counter = 0;
//        int maximum = 0;
//
//        string = "  2пробела   3пробела 1пробелИ4пробелаВконце    !!!   ";
//
//        length = string.length();
//
//        for (int i = 0; i < length; i++) {
//            if (string.charAt(i) == ' ') {
//                counter++;
//            }
//            else if (maximum < counter) {
//                maximum = counter;
//            }
//            else {
//                counter = 0;
//            }
//        }
//        System.out.println("amount = " + maximum);
//    }



    //String as String № 2

//    public static void main(String[] args) {
//
//        String string;
//        String result;
//        int length;
//
//        result = "";
//        string = "cat slack stack smash";
//
//        System.out.println(string);
//
//        length = string.length();
//
//        for (int i = 0; i < length; i++) {
//            result = result.concat(Character.toString(string.charAt(i)));
//            if (string.charAt(i) == 'a') {
//                result = result.concat("b");
//            }
//        }
//        System.out.println(result);
//    }



    //String as String № 3

//    public static void main(String[] args) {
//
//        String basicString;
//        String resultString;
//
//        resultString = "";
//        basicString = "alla";
//        System.out.println(basicString);
//
//        for (int i = basicString.length() - 1; i >= 0; i--) {
//            resultString = resultString.concat(Character.toString(basicString.charAt(i)));
//        }
//
//        if (basicString.equals(resultString)){
//            System.out.println("палиндром");
//        } else {
//            System.out.println("не палиндром");
//        }
//    }



    //String as String № 4

//    public static void main(String[] args) {
//
//        StringBuilder stringA;
//        StringBuilder stringB;
//
//        stringB = new StringBuilder("информатика");
//        stringA = new StringBuilder();
//        System.out.println(stringB);
//
//        stringA.append(stringB.charAt(7)).append(stringB.charAt(3)).append(stringB.charAt(4)).append(stringB.charAt(7));
//        System.out.println(stringA);
//    }



    //String as String № 5

//    public static void main(String[] args) {
//
//        String text;
//        int counter = 0;
//
//        Scanner in = new Scanner(System.in);
//        text = in.nextLine();
//
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == 'a') {
//                counter++;
//            }
//        }
//        System.out.println("count = " + counter);
//    }





    //String as String № 6

//    public static void main(String[] args) {
//
//        StringBuilder string;
//        int length;
//
//        string = new StringBuilder("word");
//        System.out.println(string);
//
//        length = string.length();
//
//        for (int i = 0; i < length; i += 2, length++) {
//            string.insert(i, string.charAt(i));
//        }
//        System.out.println(string);
//
//    }




    //String as String № 7

//    public static void main(String[] args) {
//
//        StringBuilder string;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите фразу");
//        string = new StringBuilder(in.nextLine());
//
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = i + 1; j < string.length(); j++){
//                if (string.charAt(j) == ' ') {
//                    string.deleteCharAt(j);
//                    j--;
//                }
//                else if (string.charAt(i) == string.charAt(j)) {
//                    string.deleteCharAt(j);
//                }
//            }
//        }
//    }




    //String as String № 8

//    public static void main(String[] args) {
//
//        String string;
//        int minIndex = 0;
//        int maxIndex = 0;
//        int counter = 0;
//        int maximum = 0;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите фразу");
//        string = in.nextLine();
//
//        for (int i = 0; i < string.length(); i++) {
//                if (string.charAt(i) == ' ') {
//                    i++;
//                    if (i > 0) {
//                        minIndex = i;
//                    } else {
//                        minIndex = 0;
//                    }
//                    counter = 1;
//                } else {
//                    counter++;
//                }
//                if (counter > maximum) {
//                    maximum = counter;
//                    maxIndex = minIndex;
//                }
//            }
//
//        System.out.println(string.substring(maxIndex, maxIndex + maximum));
//        }



    //String as String № 9

//    public static void main(String[] args) {
//
//        String stringUpperCase;
//        String stringLowerCase;
//        int upperCase = 0;
//        int lowerCase = 0;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String str = in.nextLine();
//        stringUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXWZY";
//        stringLowerCase = "abcdefghijklmnopqrstuvwxwzy";
//
//        upperCase = 0;
//        lowerCase = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (stringLowerCase.contains(str.substring(i, i + 1))) {
//                lowerCase++;
//            }
//            else if (stringUpperCase.contains(str.substring(i, i + 1))) {
//                upperCase++;
//            }
//        }
//        System.out.println("upperCase = " + upperCase);
//        System.out.println("lowerCase = " + lowerCase);
//    }




    //String as String № 10

//    public static void main(String[] args) {
//
//        int counter = 0;
//        StringBuilder string;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please, enter any sentence");
//        string = new StringBuilder(in.nextLine());
//
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) == '!' || string.charAt(i) == '?' || string.charAt(i) == '.') {
//                counter++;
//            }
//        }
//        System.out.println("Amount of sentences = " + counter);
//    }



    //Pattern & Matcher № 1
//
//    public static void main(String[] args) {
//
//        String str;
//        int amountOfparagraphs;
//        int markCount;
//        int amountOfwords;
//        int amountOfAllSentences;
//        String result = "";
//
//        amountOfAllSentences = 0;
//        markCount = 0;
//        amountOfparagraphs = 0;
//
//        str = "Hello limbo liloli loli friend!\nI live in Minsk. Belarus. Serebronx motherfucker!\nI like it! Very much!";
//
//        System.out.println(str);
//        System.out.println("_________________\n");
//
//        //get amount of paragraph in text
//        Pattern endOfParagraph = Pattern.compile("[^\n]*[^\n]");
//        Matcher paragraph = endOfParagraph.matcher(str);
//        while (paragraph.find()) {
//            amountOfparagraphs++;
//        }
//
//        String[] massiveOfParagraphs = new String[amountOfparagraphs];
//
//        //divide text for sentences
//        paragraph = endOfParagraph.matcher(str);
//        for (int i = 0; i < amountOfparagraphs; i++) {
//            paragraph.find();
//            massiveOfParagraphs[i] = paragraph.group();
//        }
//
//        int[] amountOfSentencesInParagraphs = new int[amountOfparagraphs];
//
//        //amount of sentences in text
//        Pattern endOfSentences = Pattern.compile("[^\\s][A-Za-z\\s]*[!.?]");
//        for (int i = 0; i < amountOfSentencesInParagraphs.length; i++) {
//            Matcher sentence = endOfSentences.matcher(massiveOfParagraphs[i]);
//            while (sentence.find()) {
//                amountOfSentencesInParagraphs[i]++;
//                amountOfAllSentences++;
//            }
//        }
//
//        String[] massiveOfPunctuationMark = new String[amountOfAllSentences];
//
//        //found symbols ended sentences  (!.?)
//        Pattern punctuationMark = Pattern.compile("[!.?]");
//        Matcher mark = punctuationMark.matcher(str);
//
//        for (int i = 0; i < massiveOfPunctuationMark.length; i++) {
//            mark.find();
//            massiveOfPunctuationMark[i] = mark.group();
//        }
//
//        String[] sentenceMassive = new String[amountOfAllSentences];
//
//        Matcher sentence = endOfSentences.matcher(str);
//
//        for (int i = 0; i < amountOfAllSentences; i++) {
//            sentence.find();
//            sentenceMassive[i] = sentence.group();
//        }
//
//        //for second choice
//        int q = 0;
//        int sumOfSentences = amountOfSentencesInParagraphs[q];
//        mark = punctuationMark.matcher(str);
//        sentence = endOfSentences.matcher(str);
//        Pattern endOfWords = Pattern.compile("[^!.,?\\s]*[^!.,?\\s]");
//
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("1. сортировка по количеству предложений \n2. сортировка слов по длине\n3. сортировка по лексемам\n");
//
//        System.out.print("Введите число:   ");
//        switch (in.nextInt()) {
//            case 1:
//
//                System.out.println("_________________\n");
//                //amount of sentences sort
//                for (int i = 0; i < amountOfSentencesInParagraphs.length - 1; i++) {
//
//                    for (int j = amountOfSentencesInParagraphs.length - 1; j > i; j--) {
//                        if (amountOfSentencesInParagraphs[j - 1] < amountOfSentencesInParagraphs[j]) {
//                            int tmp = amountOfSentencesInParagraphs[j - 1];
//                            amountOfSentencesInParagraphs[j - 1] = amountOfSentencesInParagraphs[j];
//                            amountOfSentencesInParagraphs[j] = tmp;
//                            String tmp2 = massiveOfParagraphs[j - 1];
//                            massiveOfParagraphs[j - 1] = massiveOfParagraphs[j];
//                            massiveOfParagraphs[j] = tmp2;
//                        }
//                    }
//                }
//                for (int i = 0; i < amountOfSentencesInParagraphs.length; i++) {
//                    System.out.println(massiveOfParagraphs[i]);
//                }
//                break;
//
//            case 2:
//
//                System.out.println("_________________\n");
//                while (sentence.find() && mark.find()) {
//
//                    amountOfwords = 0;
//                    Matcher word = endOfWords.matcher(sentence.group());
//
//                    //amount of literas in 1 sentence
//                    while (word.find()) {
//                        amountOfwords++;
//                    }
//
//                    //массив слов из 1 предложения
//                    String[] massiveOfWords = new String[amountOfwords];
//                    //массив количества букв из 1 слова
//                    int[] amountOfLiterasInWords = new int[amountOfwords];
//
//                    amountOfwords = 0;
//
//                    //массив слов в 1 предложении и количество букв в каждом слове
//                    word = endOfWords.matcher(sentence.group());
//                    for (int i = 0; i < massiveOfWords.length; i++) {
//                        word.find();
//                        massiveOfWords[i] = word.group();
//                        amountOfLiterasInWords[i] = massiveOfWords[i].length();
//                    }
//
//
//                    for (int i = 0; i < amountOfLiterasInWords.length - 1; i++) {
//                        for (int j = amountOfLiterasInWords.length - 1; j > i; j--) {
//                            if (amountOfLiterasInWords[j - 1] < amountOfLiterasInWords[j]) {
//                                int tmp3 = amountOfLiterasInWords[j - 1];
//                                amountOfLiterasInWords[j - 1] = amountOfLiterasInWords[j];
//                                amountOfLiterasInWords[j] = tmp3;
//                                String tmp4 = massiveOfWords[j - 1];
//                                massiveOfWords[j - 1] = massiveOfWords[j];
//                                massiveOfWords[j] = tmp4;
//                            }
//                        }
//                    }
//
//                    for (int i = 0; i < amountOfLiterasInWords.length; i++) {
//                        if (result != "") {
//                            result = result + " " + massiveOfWords[i];
//                        } else {
//                            result = massiveOfWords[i];
//                        }
//
//                    }
//                    result = result + mark.group();
//                    markCount++;
//
//                    if (sumOfSentences == markCount) {
//                        massiveOfParagraphs[q] = result;
//                        result = "";
//
//                        if (q < amountOfparagraphs - 1) {
//                            q++;
//                            sumOfSentences = sumOfSentences + amountOfSentencesInParagraphs[q];
//                        }
//                    }
//
//                }
//
//                for (int i = 0; i < 3; i++) {
//                    System.out.println(massiveOfParagraphs[i]);
//                }
//                break;
//
//            case 3:
//
//                System.out.println("_________________\n");
//
//                System.out.print("Введите символ(ы):   ");
//
//                Scanner reg = new Scanner(System.in);
//                String regEx = reg.nextLine();
//
//                Pattern lexemaMatcher = Pattern.compile("[^!.,?\\s]*" + regEx + "[^!.,?\\s]*");
//                Matcher lexema = lexemaMatcher.matcher(str);
//
//                System.out.println("_________________\n");
//
//                String[] massiveOfWords;
//                int[] amountOfLexemasInWords;
//                mark = punctuationMark.matcher(str);
//                sentence = endOfSentences.matcher(str);
//
//                while (sentence.find() && mark.find()) {
//                    amountOfwords = 0;
//                    Matcher word = endOfWords.matcher(sentence.group());
//
//                    //подсчет количества слов в 1 предложении
//                    while (word.find()) {
//                        amountOfwords++;
//                    }
//
//                    //массив слов из 1 предложения
//                    massiveOfWords = new String[amountOfwords];
//                    //массив букв из 1 слова
//                    amountOfLexemasInWords = new int[amountOfwords];
//
//                    amountOfwords = 0;
//
//                    //массив слов в 1 предложении и количество букв в каждом слове
//                    word = endOfWords.matcher(sentence.group());
//
//
//                    Pattern lexemas = Pattern.compile(regEx);
//                    Matcher amountOfLexemas = lexemaMatcher.matcher(str);
//
//
//                    //Определение количества лексем в словах
//                    for (int i = 0; i < massiveOfWords.length; i++) {
//                        word.find();
//                        massiveOfWords[i] = word.group();
//                        amountOfLexemas = lexemas.matcher(massiveOfWords[i]);
//                        while (amountOfLexemas.find()) {
//                            amountOfLexemasInWords[i]++;
//                        }
//                    }
//
//                    //сортировка по количеству лексем в слове
//                    for (int i = 0; i < massiveOfWords.length - 1; i++) {
//                        for (int j = massiveOfWords.length - 1; j > i; j--) {
//                            if (amountOfLexemasInWords[j - 1] < amountOfLexemasInWords[j]) {
//                                int tmp3 = amountOfLexemasInWords[j - 1];
//                                amountOfLexemasInWords[j - 1] = amountOfLexemasInWords[j];
//                                amountOfLexemasInWords[j] = tmp3;
//                                String tmp4 = massiveOfWords[j - 1];
//                                massiveOfWords[j - 1] = massiveOfWords[j];
//                                massiveOfWords[j] = tmp4;
//                            }
//                        }
//                    }
//
//                    //сортировка по алфавиту после сортировки по количеству лексем
//
//                    int max = amountOfLexemasInWords[0];
//                    int biginning = 0, ending = 0;
//                    for (int a = 0; a < massiveOfWords.length; a++) {
//
//
//                        if (max > amountOfLexemasInWords[a] || massiveOfWords.length - 1 == a) {
//                            ending = a - 1;
//
//                            if (massiveOfWords.length - 1 == a) {
//                                ending = a;
//                            }
//
//                            for (int j = biginning; j < ending; j++) {
//                                for (int i = j + 1; i <= ending; i++) {
//                                    int smoller;
//                                    if (massiveOfWords[i].length() > massiveOfWords[j].length()) {
//                                        smoller = massiveOfWords[j].length();
//                                    } else {
//                                        smoller = massiveOfWords[i].length();
//                                    }
//                                    for (int z = 0; z < smoller; z++) {
//                                        if (Character.getNumericValue(massiveOfWords[j].charAt(z)) > Character.getNumericValue(massiveOfWords[i].charAt(z))) {
//                                            String k = massiveOfWords[j];
//                                            massiveOfWords[j] = massiveOfWords[i];
//                                            massiveOfWords[i] = k;
//                                            break;
//                                        } else if (Character.getNumericValue(massiveOfWords[j].charAt(z)) < Character.getNumericValue(massiveOfWords[i].charAt(z))) {
//                                            break;
//                                        }
//                                    }
//
//                                }
//                            }
//
//                            max = amountOfLexemasInWords[a];
//                            biginning = a;
//                        }
//                    }
//
//                    for (int i = 0; i < massiveOfWords.length; i++) {
//                        if (result != "") {
//                            result = result + " " + massiveOfWords[i];
//                        } else {
//                            result = massiveOfWords[i];
//                        }
//
//                    }
//                    result = result + mark.group();
//                    markCount++;
//
//                    if (sumOfSentences == markCount) {
//                        massiveOfParagraphs[q] = result;
//                        result = "";
//
//                        if (q < amountOfparagraphs - 1) {
//                            q++;
//                            sumOfSentences = sumOfSentences + amountOfSentencesInParagraphs[q];
//                        }
//                    }
//
//                }
//                for (int i = 0; i < 3; i++) {
//                    System.out.println(massiveOfParagraphs[i]);
//                }
//                break;
//        }
//
//
//    }



    //Pattern & Matcher № 2
//
//    public static void main(String[] args) {
//
//        String xmlDoc;
//        int counter = 0;
//        String tmpDoc = "";
//        String tmpDoc2 = "";
//        String tmpDoc3 = "";
//
//        xmlDoc = "<notes>\n\t<note id = \"1\">\n\t\t<to>Вася</to>\n\t\t<from>Света</from>\n\t\t<heading>Напоминание</heading>\n\t\t" +
//                "<body>Позвони мне завтра!</body>\n\t</note>\n\t<note id = \"2\">\n\t\t<to>Петя</to>\n\t\t<from>Маша</from>" +
//                "\n\t\t<heading>Важное напоминание</heading>\n\t\t<body/>\n\t</note>\n</notes>";
//
//        Pattern endOftags = Pattern.compile("((<(\\w+)[a-z\\s=\"0-9]*>)((\\n*?.*?)*?)(</\\3>))|(</?(\\w+)*[a-z\\s=\"0-9]*/?>)");
//
//        Matcher tags = endOftags.matcher(xmlDoc);
//        while (tags.find()) {
//            System.out.println("--------------");
//            xmlDoc = tags.group(4);
//            System.out.println(tags.group(1) + " - открывающий тег");
//            System.out.println(tags.group(6) + " - закрывающий тег");
//        }
//
//        Matcher tags2 = endOftags.matcher(xmlDoc);
//        while (tags2.find()) {
//            counter++;
//        }
//        tags2 = endOftags.matcher(xmlDoc);
//
//        String[] tagString = new String[counter];
//        counter = 0;
//
//        while (tags2.find()) {
//            System.out.println("--------------");
//            System.out.println(tags2.group(1) + " - открывающий тег");
//            System.out.println(tags2.group(6) + " - закрывающий тег");
//            tagString[counter] = tags2.group(4);
//            counter++;
//        }
//
//        Pattern endOftags3 = Pattern.compile("((<(\\w+)[a-z\\s=\"0-9]*>)((\\n*?.*?)*?)(</\\3>))|(</?(\\w+)*[a-z\\s=\"0-9]*/?>)");
//        Matcher tags3 = endOftags.matcher(tagString[1]);
//        System.out.println("tagString[1] = " + tagString[1]);
//
//        while (tags3.find()) {
//            System.out.println("--------------");
//            System.out.println(tags3.group());
//        }
//
//        xmlDoc = "<notes>\n\t<note id = \"1\">\n\t\t<to>Вася</to>\n\t\t<from>Света</from>\n\t\t<heading>Напоминание</heading>\n\t\t" +
//                "<body>Позвони мне завтра!</body>\n\t</note>\n\t<note id = \"2\">\n\t\t<to>Петя</to>\n\t\t<from>Маша</from>" +
//                "\n\t\t<heading>Важное напоминание</heading>\n\t\t<body/>\n\t</note>\n</notes>";
//
//        System.out.println("Some Shit");
//
//
//        weNeedToGoDeeper(xmlDoc);
//
//    }
//
//
//    public static void weNeedToGoDeeper (String xml) {
//        String str = null;
//        String str2 = "<body/>";
//        Pattern endOftags = Pattern.compile("((<(\\w+)[a-z\\s=\"0-9]*>)((\\n*?.*?)*?)(</\\3>))|(</?(\\w+)*[a-z\\s=\"0-9]*/?>)");
//        Matcher tags = endOftags.matcher(xml);
//        while (tags.find()) {
//            System.out.println("--------------");
//
//            if (tags.group(4) == null) {
//                System.out.println(tags.group(7) + " - тег без тела");
//                break;
//            }
//
//            System.out.println(tags.group(2) + " - открывающий тег");
//            System.out.println(tags.group(4) + " - содержимое тега");
//            System.out.println(tags.group(6) + " - закрывающий тег");
//
//            weNeedToGoDeeper(tags.group(4));
//        }
//    }



}