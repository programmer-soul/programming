public class Main {
    public static void main(String[] args) {
        short[] d = new short[(19 - 5) / 2 + 1];
        /* Необходимое количество элементов на промежутке [a;b] = b - a + 1.
        Т.к. только нечетные, то (b-a) / 2
         */
        float[] x = new float[10];
        int X = 8, Y = 10;
        float[][] c = new float[X][Y];

        int number = 5;
        for (int i = 0; i < d.length; i++) {
            /*
            Заполняем массив "d" нечетными числами от 5 до 19 включительно
             */
            d[i] = (short) number;
            number += 2;
        }

        for (int i = 0; i < 10; i++) {
            x[i] = (float) Math.random() * (12F - (-14F)) + (-14F); // вычисляем рандомное число из промежутка -14 до 12, где F показывает, что число float
            /*
            Math.random()(double) * (max - min) + min, так как random генерирует от  >= 0.0 и < 1.0 –> 0.0 * (max - min) + min = min
            || 1.0 * (max - min) + min = max -> все остальные числа мы будет получать из диапозона от min до max,
            Math.random генерит числа типа double, указываем тип float
             */
        }
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (d[i] == 11) {
                    c[i][j] = (float) Math.pow((((0.5 - Math.sin(Math.cbrt(x[j]))) / 1) / 4), (Math.cbrt(Math.pow(x[j], 2 * x[j]))));
                } else if (d[i] == 7 || d[i] == 9 || d[i] == 13 || d[i] == 17) {
                    c[i][j] = (float) Math.pow(((Math.log10(Math.pow(Math.tan(x[j]), 2))) / 2), (Math.cbrt(Math.atan((x[j] - 1) / 26))));
                } else {
                    c[i][j] = (float) Math.pow(((4) / (1 - Math.tan(Math.asin(Math.pow(Math.E, -Math.abs(x[j])))))), Math.pow(Math.E, Math.pow((Math.pow((Math.PI / x[j]), 3)) * ((1 / 4) - Math.tan(x[j])), 3)));
                }
            }
        }
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                String output;
                int res = (int) Math.log10(Math.abs(c[i][j])) + 1;
                /*
                Получаем целую часть числа с помощью математичского представления и отбрасывания дробной части (int)
                 */
                if (Float.isNaN(c[i][j])) {
                    /*
                    Проверяем является ли элемент "не числом", и если да -> представляем его запись в виде строки со значением NaN,
                    т.к. NaN не форматируется для красивого вывода в столбик
                     */
                    output = "NaN";
                } else {
                    if (res >= 1 && res <= 3) {
                        output = String.format("%.4f", c[i][j]);
                        /*
                        Если количество цифр в целой части от 1 до 3, то выводим число в формате ###.####, f – показывает, что число float
                         */
                    } else {
                        output = String.format("%.1e", c[i][j]);
                        /*
                         Если количество цифр в целой части больше 3, выводим число в экспотенциальном формате
                         */
                    }
                }
                System.out.printf("%-15s", output); // ширина столбика 15, \t – символ табуляции, "-" – вырав. по левому краю
            }
            System.out.println();
        }

    }
}
