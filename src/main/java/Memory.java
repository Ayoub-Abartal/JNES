public class Memory {

    private byte[] ram = new byte[2048];

    public Memory() {
        for(int i = 0;i<ram.length ;i++){
            this.ram[i] = 0x000;
        }
    }

    public byte[] getRam(){
        return this.ram;
    }
}
