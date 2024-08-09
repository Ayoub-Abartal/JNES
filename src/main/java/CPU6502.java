public class CPU6502 {

    private int accumulator;
    private int x,y; // index registers
    private int programCounter;
    private int stackPointer;

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

    }


}
