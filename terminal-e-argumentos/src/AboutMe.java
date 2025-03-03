public class AboutMe {
    public static void main(String[] args){
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        double altura = Double.valueOf(args[2]);

        System.out.println("Me chamo" + nome + ", tenho " + idade + " anos e tenho " + altura "m de altura");
    }
}
