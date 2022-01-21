public class IntegerPasha {
    public static void main(String[] args) {
        //подсчет сколько лет, месяцев и дней в определенном количестве дней
            int days = 12;
        int years = days / 365;
        int month = (days % 365) / 31;
        int leftDays = days - years * 365 - month * 31;
        System.out.println("Общее кол-во дней: " + days);
        System.out.println("Лет: " + years);
        System.out.println("Месяцев: " + month);
        System.out.println("Дней: " + leftDays);

        //условный оператор if - программа включения и выключения кондиционера при определенных условиях
        int temp = 23;
        if (temp > 25) {
            System.out.println("Кондиционер включен");
    } else if (temp < 22) {
            System.out.println("Кондиционер выключен");
        } else {
            System.out.printf("Кондиционер ничего не делает");
        }
        }

    }
