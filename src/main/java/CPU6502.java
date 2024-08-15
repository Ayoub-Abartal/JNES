public class CPU6502 {

    private byte accumulator; // register
    private byte X,Y; // index registers
    private short programCounter;
    private byte stackPointer;

    //Status flags
    private boolean C;
    private boolean Z;
    private boolean I;
    private boolean D;
    private boolean B;
    private boolean V;
    private boolean N;

    private Memory memory;

    public CPU6502(Memory memory){
        this.memory = memory;
        reset();
    }

    public void reset(){
        accumulator = X = Y = 0;
        this.programCounter = (short) 0xFFFC;
        this.stackPointer = (byte) 0x8000;
        C = Z = I = D = B = V = N = false;
    }

    public void execute(int cycles, Memory mem ){
        while( cycles > 0 ){
            byte instruction = fetch(mem);
            cycles--;
        }
    }

    public byte fetch(Memory mem){
        byte[] ram = mem.getRam();
        byte data = ram[this.programCounter] ;
        this.programCounter++;
        return data;
    }


}
