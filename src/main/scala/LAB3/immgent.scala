package LAB3
import chisel3 . _
import chisel3 . util . _
class LM_IO_Interface_ImmdValGen extends Bundle {
val instr = Input (UInt(3.W))
val immd_se = Output (UInt(32.W))
}
class ImmdValGen extends Module {
    val io = IO (new LM_IO_Interface_ImmdValGen)
switch(io.instr){
    is("b0010011".U){
        io.immd_se := Cat(Fill(20,io.instr(31)),io.instr(20,31)) 
    }
    is("b0100011".U){
        io.immd_se := Cat(Fill(20,io.instr(31)),io.instr(25,31),io.instr(7,11))
    }
    is("b1100011".U){
        io.immd_se := Cat(Fill(19,io.instr(31)),io.instr(7),io.instr(25,30),io.instr(31),io.instr(8,11))
    }
    is("b0010111".U){
        io.immd_se := Cat(Fill(12, io.instr(31)), io.instr(31, 12))
    }
    is("b1101111".U){
        io.immd_se := Cat(Fill((11), io.instr(31)), io.instr(31), io.instr(19, 12), io.instr(20), io.instr(31, 21))
    }
    }
}

