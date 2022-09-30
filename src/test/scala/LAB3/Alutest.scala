package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class ALUtest extends FreeSpec with ChiselScalatestTester{
    "Alu Test" in {
        test(new ALU){
            C =>
            C.io.in_A.poke(10.U)
            C.io.in_B.poke(5.U)
            C.io.alu_Op.poke(1.U)
            C.clock.step(100)
        }
    }
}