/*В файле содержится строка с исходными данными в такой форме:
{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = \"Ivanov\" AND country = \"Russia\" AND city = \"Moscow\";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder.
 Значения null не включаются в запрос.*/

public class task1 {
    public static void main(String[] args) {
        String in = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        in = in.substring(1, in.length() - 1);

        StringBuilder builder = new StringBuilder();
        builder.append("SELECT * FROM students WHERE ");
        boolean isFirst = true;

        String[] parts = in.split(", ");
        for (String part : parts) {
            String[] keyValue = part.split(":");
            String key = keyValue[0];
            key = key.substring(1, key.length() - 1);
            String value = keyValue[1];
            System.out.println(key);
            System.out.println(value);

            if (value.equals("\"null\""))
                continue;
            if (!isFirst)
                builder.append(" AND ");
            builder.append(String.format("%s = %s", key, value));
            isFirst = false;

        }
        System.out.println(builder.toString());
    }

}
