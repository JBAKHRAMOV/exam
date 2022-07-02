package com.company;

public class Main {

    public static void main(String[] args) {
        /*// exercise 1
        int matrix[][] = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},};

        int[] location = getCurrentLocation(matrix);
        if (location == null) {
            System.out.println("Incurect Location");
            return;
        }
        System.out.println("Steps " + countSteps(location[0], location[1], matrix));*/



        // exercise 2
//        exercise_2(5);


        exercise_3("kelajak");

    }


    public static int[] exercise_1(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int countSteps(int locationI, int locationJ, int[][] matrix) {
        // markazni xisoblaymiz.
        int centerI = matrix.length / 2;
        int centerJ = matrix.length / 2;

        //markazdan hozirgi turgan joyni ayiramiz va moduleni olamiz.
        int a = Math.abs(centerI - locationI);
        int b = Math.abs(centerJ - locationJ);
        return a + b;
    }


    public static void exercise_2(Integer n) {
            long count = 0;

            long multi = 1;
            for (long i = 1; i <= n; i++) {
                for (long j = 2; j <= n; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    multi *= i;
                }
                count = 0;
            }
            for (long i = multi; i != 0; i = i / 10) {
                if (i % 10 == 0) {
                    count++;
                }
            }
            System.out.println(multi);
            System.out.println(count);

        }

        public static void exercise_3(String str ){
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            char[] encoded = {'t', 'c', 'd', 'o', 'p', 'y', 'g', 'e', 'f', 'o', 'p', 'a', 'm',
                    'p', 'l', 'p', 'q', 's', 't', 'e', 'f', 'v', 'w', 'x', 'y', 'z'};

            var newStr=new StringBuilder();
            for (int i = 0; i <str.length() ; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (str.charAt(i)==alphabet[j]){

                        newStr.append(encoded[j]);
                    }
                }
            }
            System.out.println(newStr.toString());
        }
    }




