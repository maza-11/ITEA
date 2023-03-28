package HomeWork_L10.Task_2;

    class ColorPrinter extends Printer {
        private String color;

        public ColorPrinter(String color) {
            this.color = color;
        }

        @Override
        public void print(String value) {
            switch (color) {
                case "red":
                    System.out.print("\033[31m"); // ANSI escape sequence для червоного кольору
                    break;
                case "green":
                    System.out.print("\033[32m"); // ANSI escape sequence для зеленого кольору
                    break;
                case "blue":
                    System.out.print("\033[34m"); // ANSI escape sequence для синього кольору
                    break;
                default:
                    // Якщо колір не відповідає жодному з визначених, використовується чорний колір
                    System.out.print("\033[30m"); // ANSI escape sequence для чорного кольору
                    break;
            }

            super.print(value);

            // Скидання форматування
            System.out.print("\033[0m");
        }
    }