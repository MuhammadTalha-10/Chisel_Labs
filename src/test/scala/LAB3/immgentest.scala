package LAB3

import chisel3._
import org.scalatest._
import chiseltest._
import utest.Tests

class ImmValGenTest extends FreeSpec with ChiselScalatestTester{
    "ImmVal Gen Test" in {
        test(new ImmdValGen){
            C => 
            C.io.instr.poke("b0010011".U)
            C.clock.step(100)
        }
    }
}