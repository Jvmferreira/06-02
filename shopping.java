public class shopping{
    String nomedoshopping;
    String cidadedoshoppping;
    String bairrodoshopping;
    String ruadoshopping;
    String numerodoshopping;

    public shopping( String nomedoshopping,
    String cidadedoshoppping,
    String bairrodoshopping,
    String ruadoshopping,
    String numerodoshopping){
     this.nomedoshopping=nomedoshopping;
     this.cidadedoshoppping=cidadedoshoppping;
     this.bairrodoshopping=bairrodoshopping;
     this.ruadoshopping =ruadoshopping;
     this.numerodoshopping =numerodoshopping;
    }
    public void nomedoshopping(){
        System.out.println("nomedoshopping:  " +nomedoshopping);
        System.out.println("cidadedoshopping:  "+cidadedoshoppping);
        System.out.println("bairrodoshopping:  "+bairrodoshopping);
        System.out.println("ruadoshopping:  "+ruadoshopping);
        System.out.println("numerodoshopping:  "+numerodoshopping);
    }




    
    public static void main(String[]args){
        shopping shop = new shopping    ("Norte Shopping", "Rio de Janeiro", "Del Castilho", "Av. Dom Helder Câmara", "1313");
        shop.nomedoshopping();
    }
}

