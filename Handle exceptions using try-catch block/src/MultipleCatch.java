public class MultipleCatch {
    public static void main(String[]args){
        try{
            int result=10/0;
            String str =null;
            System.out.println(str.length());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: Cannot divide by 0.");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception:String is null.");
        }
    }
}
