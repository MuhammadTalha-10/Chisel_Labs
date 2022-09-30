package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class BranchControltest extends FreeSpec with ChiselScalatestTester{
    "Branch control test" in{
        test(new BranchControl){
            C =>
            C.io.arg_x.poke(3.U)
            C.io.arg_y.poke(5.U)
            C.io.branch.poke(1.B)
            C.io.fnct3.poke("b010".U)
            C.clock.step(100)
        }
    }
}