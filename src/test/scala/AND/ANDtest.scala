package AND
import chisel3._
import org.scalatest._
import chiseltest._

class ANDtest extends FreeSpec with ChiselScalatestTester{
    "AND Gate Test" in{
        test(new AND()){
            C =>
            C.io.a.poke(1.U)
            C.io.b.poke(0.U)
            C.clock.step(3)
            C.io.c.expect(0.U)
            
        }
    }
} 