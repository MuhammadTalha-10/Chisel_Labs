package LAB8
import chisel3._
import chisel3.util._
class memory_assignment extends Module {
    val io = IO (new Bundle {
    val memory_out = Vec(4,(Output(UInt(32.W))))
    val requestor = Flipped (Vec(4,(Decoupled(UInt(32.W)))))
    val Readaddr = Input (UInt(5.W))
    val Writeaddr = Input (UInt(5.W))
    val write_en = Input(Bool())
    val out = Decoupled(Output(UInt(32.W)))
    
})

    
    val queue0 = Queue(io.requestor(0),1)
    val queue1 = Queue(io.requestor(1),1)
    val queue2 = Queue(io.requestor(2),1)
    val queue3 = Queue(io.requestor(3),1)
 
    val arb = Module (new Arbiter(UInt() ,4))
   
    arb.io.in(0) <> queue0
    arb.io.in(1) <> queue1
    arb.io.in(2) <> queue2
    arb.io.in(3) <> queue3

    io.out <> arb.io.out

    val memory1 = SyncReadMem (1024, UInt(32.W))
    val memory2= SyncReadMem (1024, UInt(32.W))
    val memory3 = SyncReadMem (1024, UInt(32.W))
    val memory4 = SyncReadMem (1024, UInt(32.W))
    
    when(io.write_en){
        memory1.write(io.Writeaddr,arb.io.out.bits(0))
        memory2.write(io.Writeaddr,arb.io.out.bits(1))
        memory3.write(io.Writeaddr,arb.io.out.bits(2))
        memory4.write(io.Writeaddr,arb.io.out.bits(3))
        
    }
    io.memory_out(0):= memory1.read(io.Readaddr)
    io.memory_out(1):= memory2.read(io.Readaddr)
    io.memory_out(2):= memory3.read(io.Readaddr)
    io.memory_out(3):= memory4.read(io.Readaddr)
    
}
     
 

 

