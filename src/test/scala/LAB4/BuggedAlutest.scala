package LAB4

import chisel3._
import org.scalatest._
import chiseltest._

class buggedalutest extends FreeSpec with ChiselScalatestTester{
    "bugged Alu Test" in{
        test(new ALU){
            C =>
            C.io.in_A.poke(3.U)
            C.io.in_B.poke(2.U)
            C.io.alu_Op.poke(3.U)
            C.clock.step(100)
        }
    }
}