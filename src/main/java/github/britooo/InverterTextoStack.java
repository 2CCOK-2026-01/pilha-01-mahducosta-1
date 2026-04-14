package github.britooo;

public class InverterTextoStack {
        public static String inverter(String input) {
            Pilha pilha = new Pilha(input.length());
            for (int i = 0; i < input.length(); i++) {
                pilha.push(input.split("")[i]);
            }

            System.out.println(pilha.size());
            StringBuilder stringBuilder = new StringBuilder();
            var sizezao = pilha.size();
            for (int i = 0; i < sizezao; i++) {
                System.out.println(i);
                stringBuilder.append(pilha.pop());
            }
            return stringBuilder.toString();
        }
}
