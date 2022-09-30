package LAB1
import chisel3._ 
import chisel3.util._ 
// import java.io.File
class counter_up_down(n: Int) extends Module{ 
    val io = IO(new Bundle { 
        val data_in = Input(UInt(5.W)) 
        val reload = Input(Bool()) 
        val out = Output(Bool()) 
    })
    io.out := 1.U
    val counter = RegInit(0.U(3.W)) 
    val max_count = RegInit(6.U(3.W))
    var flag = RegInit(0.U(1.W))
    dontTouch(counter)
    when(counter === 0.U){
        flag := 0.U
    }   
        when(flag === 0.U & counter =/= max_count){
            counter := counter + 1.U
    }
    when(counter === max_count){
        flag := 1.U
    }   
        when(flag === 1.U & counter =/= 0.U){
            counter := counter - 1.U
        
    }
   io.out := 0.U
}

        
    
       

        
    
