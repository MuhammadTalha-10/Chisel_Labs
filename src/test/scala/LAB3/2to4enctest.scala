package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class enc2to4test extends FreeSpec with ChiselScalatestTester{
    "encoder test" in{
        test (new encoder2to4){
            C =>
            C.io.in.poke("b0100".U)
            C.clock.step(100)
        }
    }
}