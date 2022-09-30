package XOR
import chisel3._

class XOR extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))
        val c = Input(UInt(1.W))
    })
    io.c := io.a ^ io.b

}
