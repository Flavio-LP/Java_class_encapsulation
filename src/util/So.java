package util;

public class So {

            public static void LimpaTerminal(){
        
            try{
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    Runtime.getRuntime().exec("clear");
                }
            }catch(Exception e){
                System.err.println("Erro ao limpar o console: " + e.getMessage());
            }
    }
    
}
