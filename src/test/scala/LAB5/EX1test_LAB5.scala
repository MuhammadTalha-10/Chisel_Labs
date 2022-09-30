package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class EX1test extends FreeSpec with ChiselScalatestTester{
    "EX1 Test" in{
        test(new ALU(2)){
        C =>
        C.io.arg_x.poke(3.U)
        C.io.arg_y.poke(3.U)
        C.io.alu_oper.poke("b0000".U)
        C.clock.step(100)
    }
}
}