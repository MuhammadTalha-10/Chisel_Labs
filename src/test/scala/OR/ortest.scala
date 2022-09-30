package OR
import chisel3._
import org.scalatest._
import chiseltest._

class ortest extends FreeSpec with ChiselScalatestTester{
    "OR Gate Test" in{
        test(new OR()){
            C =>
            C.io.a.poke(1.U)
            C.io.b.poke(0.U)
            C.clock.step(5)
            C.io.c.expect(1.U)
            
        }
    }
} 