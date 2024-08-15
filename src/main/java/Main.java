public class Main {

    public static void main(String args[] ){

        Memory mem = new Memory();
        CPU6502 cpu6502 = new CPU6502(mem);
        cpu6502.execute(2, mem);
    }
}
