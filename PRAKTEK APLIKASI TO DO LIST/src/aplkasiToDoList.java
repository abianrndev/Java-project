import java.util.Scanner;

public class aplkasiToDoList {

    public static String[] model = new String[10];
    public static java.util.Scanner
            scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }


    /**
     * menampilkan todo ke list
     */
    public static void showTodo(){
        System.out.println("TO DO LIST HARI INI");
        for(var i = 0 ; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowtodo(){
        model[0] = "Belajar java Dasar";
        model[1] = "study case membuat aplikasi todo list";
        showTodo();
    }
    /**
     * menambah todo ke list
     */
    public static void addToDo(String todo){
        //cek apakah model penuh?
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        //jika penuh kita resize ukuran jadi 2 x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length ; i++) {
                model[i] = temp[i];
            }
        }

        //tambahkan ke posisi yang data array nya NULL
        //cara membaca perulangan : i kurang dari model.lenght
        //if (jika index model = null maka kita dapat menambahkan model todo
        for (var i = 0; i < model.length ; i++) {
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }
    public static void testAddTodo(){
        for (int i = 0; i < 25; i++) {
            addToDo("contoh ke 1" + i);
        }
        //showTodo();
    }

    //test add todo lis
    /**
     * menghapus todo ke list
     */
    public static boolean removeTodo(int number) {
        //cek kalau nomor item (number) lebih panjang dari array
        if ((number - 1) >= model.length){
        return false;
        //cek kalau item di nomor itu udah null
    }   else if(model[number - 1] == null){
        return false;
        //hapus item
    }   else {
            for (int i = (number - 1); i < model.length ; i++) {
                if (i == (model.length - 1)){
                    model[i] = null;
                }
                else {
                    model[i] = model[i+1];
                }
            }

        return true;
        }
    }
    public static void testRemoveTodo(){
        addToDo("Satu");
        addToDo("dua");
        addToDo("tiga");
        addToDo("empat");
        addToDo("lima");

        var result = removeTodo(20);
        System.out.println(result);

        result = removeTodo(7);
        System.out.println(result);

        result= removeTodo(2);
        System.out.println(result);

        showTodo();

    }
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    public static void testInput(){
        var name = input("Nama");
        var kelas = input("kelas");

        System.out.println("hai " + name + " dari kelas " +kelas);

    }
    /**
     * menampilkan view to do list
     */
    public static void viewShowTodoList() {
        while (true) {

        showTodo();

        System.out.println("MENU");
        System.out.println("1. TAMBAH");
        System.out.println("2. HAPUS");
        System.out.println("x. KELUAR");

        var input = input("Pilih");
        if (input.equals("1")) {
            viewAddTodoList();
        } else if (input.equals("2")) {
            viewRemoveTodoList();
        } else if (input.equals("x")) {
            break;
        } else {
            System.out.println("piilihan tidak terpenuhi");
            }
         }
    }
    public static void testViewShowTodoList(){
        addToDo("Satu");
        addToDo("dua");
        addToDo("tiga");
        addToDo("empat");
        addToDo("lima");
        viewShowTodoList();
    }


    /**
     * menampilkan view add to do list
     */
    public static void viewAddTodoList(){
        System.out.println("Masukkan Rencana kamu hari ini :D");

        String todo = input("Todo (press x jika batal");
        if(todo.equals("x")){
            //batal
        } else {
            addToDo(todo);
        }
    }
    public static void testViewAddTodoList(){
        viewShowTodoList();

        showTodo();
    }

    /**
     * menampilkan view menghapus to do list
     */
    public static void viewRemoveTodoList(){
        System.out.println("Hapus todo list kamu");

        var number = input("Masukkan Nomor todo yang akan dihapus (tekan x jika batal");
        if (number.equals("x")) {
            //batal
        }else{
           boolean succes =  removeTodo(Integer.valueOf(number));
           if(!succes){
               System.out.println("gagal menghapus todolist : ");
           }
        }

    }
    public static void testViewRemoveTodo(){
        addToDo("satu");
        addToDo("dua");
        addToDo("tiga");

        viewShowTodoList();
        showTodo();
    }

}
