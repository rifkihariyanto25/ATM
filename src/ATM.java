import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Tarik = 0, Setor = 0, Transfer = 0, Tujuan = 0, Admin = 0;
        float Saldo = 1500000;
        int pin = 251003, a;
        boolean lanjut = true;
        int percobaan = 0;

        do {
            System.out.println("Selamat Datang Di ATM ");
            System.out.print("Masukkan PIN Anda : ");
            a = scanner.nextInt();
            percobaan++;
            if (a == pin) {

                System.out.println("1. Cek Saldo ");
                System.out.println("2. Tarik Tunai ");
                System.out.println("3. Setor Tunai ");
                System.out.println("4. Transfer ");
                System.out.println("5. Pembayaran");
                System.out.println("6. Keluar");

                System.out.print("Pilih Menu : ");
                int menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("Saldo Anda Saat Ini : " + Saldo);
                        break;

                    case 2:
                        System.out.println("1. 100000");
                        System.out.println("2. 300000");
                        System.out.println("3. 500000");
                        System.out.println("4. Penarikan Jumlah Lain");
                        int jumlah = scanner.nextInt();
                        switch (jumlah) {
                            case 1:
                                Tarik = 100000;
                                if (Tarik % 50000 == 0) {
                                    if (Saldo - Tarik < 50000) {
                                        System.out.println(
                                                "Transaksi Tidak Berhasil. Saldo harus tersisa minimal 50.000 setelah penarikan.");
                                    } else {
                                        Saldo -= Tarik;
                                        System.out.println("Penarikan berhasil.");
                                        System.out.println("Saldo Anda Sekarang : " + Saldo);
                                    }
                                } else {
                                    System.out.println("Jumlah penarikan harus kelipatan 50.000");
                                }
                                System.out.println("Penarikan Berhasil");
                                break;
                            case 2:
                                Tarik = 300000;
                                if (Tarik % 50000 == 0) {
                                    if (Saldo - Tarik < 50000) {
                                        System.out.println(
                                                "Transaksi Tidak Berhasil. Saldo harus tersisa minimal 50.000 setelah penarikan.");
                                    } else {
                                        Saldo -= Tarik;
                                        System.out.println("Penarikan berhasil.");
                                        System.out.println("Saldo Anda Sekarang : " + Saldo);
                                    }
                                } else {
                                    System.out.println("Jumlah penarikan harus kelipatan 50.000");
                                }
                                System.out.println("Penarikan Berhasil");
                                System.out.println("Penarikan Berhasil");
                                break;
                            case 3:
                                Tarik = 500000;
                                if (Tarik % 50000 == 0) {
                                    if (Saldo - Tarik < 50000) {
                                        System.out.println(
                                                "Transaksi Tidak Berhasil. Saldo harus tersisa minimal 50.000 setelah penarikan.");
                                    } else {
                                        Saldo -= Tarik;
                                        System.out.println("Penarikan berhasil.");
                                        System.out.println("Saldo Anda Sekarang : " + Saldo);
                                    }
                                } else {
                                    System.out.println("Jumlah penarikan harus kelipatan 50.000");
                                }
                                System.out.println("Penarikan Berhasil");
                                System.out.println("Penarikan Berhasil");
                                break;
                            case 4:
                                System.out.print("Masukkan Nominal : ");
                                Tarik = scanner.nextInt();
                                if (Tarik % 50000 == 0) {
                                    if (Saldo - Tarik < 50000) {
                                        System.out.println(
                                                "Transaksi Tidak Berhasil. Saldo harus tersisa minimal 50.000 setelah penarikan.");
                                    } else {
                                        Saldo -= Tarik;
                                        System.out.println("Penarikan berhasil.");
                                        System.out.println("Saldo Anda Sekarang : " + Saldo);
                                    }
                                } else {
                                    System.out.println("Jumlah penarikan harus kelipatan 50.000");
                                }
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.print("Masukkan Jumlah Setor : ");
                        Setor = scanner.nextInt();
                        Saldo += Setor;
                        System.out.println("Setoran berhasil.");
                        System.out.println("Saldo Anda Sekarang : " + Saldo);
                        break;

                    case 4:
                        System.out.print("Masukkan Jumlah Transfer : ");
                        Transfer = scanner.nextInt();
                        if (Saldo >= Transfer) {
                            System.out.println("Pilih Jenis Transfer");
                            System.out.println("1. Antar Bank");
                            System.out.println("2. Beda Bank");
                            int Jenis = scanner.nextInt();

                            switch (Jenis) {
                                case 1:
                                    Saldo -= Transfer;
                                    System.out.println("Transfer Antar Bank berhasil.");
                                    System.out.println("Saldo Anda Sekarang : " + Saldo);
                                    break;

                                case 2:
                                    System.out.print("Masukkan Nama Bank Tujuan : ");
                                    scanner.nextLine();
                                    String BankTujuan = scanner.nextLine();
                                    Admin = 6500;
                                    Saldo -= (Transfer + Admin);
                                    System.out.println("Transfer ke " + BankTujuan + " berhasil.");
                                    System.out.println("Saldo Anda Sekarang : " + Saldo);
                                    break;

                                default:
                                    System.out.println("Jenis transfer tidak valid.");
                                    break;
                            }
                        } else {
                            System.out.println("Saldo Anda Tidak Cukup");
                        }
                        break;

                    case 5:
                        System.out.println("Silahkan Pilih Jenis Pembayaran ");
                        System.out.println("1. Pulsa");
                        System.out.println("2. Tagihan Listrik");
                        System.out.println("3. Tagihan Air");
                        int bayar = scanner.nextInt();

                        Admin = 2500;
                        switch (bayar) {
                            case 1:
                                System.out.print("Masukkan Nomor HP: ");
                                int HP = scanner.nextInt();
                                System.out.print("Masukkan Nominal Pulsa : ");
                                int Pulsa = scanner.nextInt();
                                if (Pulsa >= Saldo) {
                                    System.out.println("Maaf Saldo Anda Tidak Cukup ");
                                } else {
                                    Saldo -= (Pulsa + Admin);
                                    System.out.println("Pembayaran Pulsa Berhasil.");
                                    System.out.println("Saldo Anda Sekarang : " + Saldo);
                                }
                                break;

                            case 2:
                                System.out.println("Pilih Jenis Pembayaran Listrik");
                                System.out.println("1. Token");
                                System.out.println("2. Listrik");
                                int listrik = scanner.nextInt();
                                switch (listrik) {
                                    case 1:
                                        System.out.print("Masukkan Nomor Token Listrik: ");
                                        int NoToken = scanner.nextInt();
                                        System.out.print("Masukkan Jumlah Pembelian: ");
                                        int Token = scanner.nextInt();
                                        if (Token >= Saldo) {
                                            System.out.println("Maaf Saldo Anda Tidak Cukup ");
                                        } else {
                                            Saldo -= (Token + Admin);
                                            System.out.println("Pembayaran Token Listrik Berhasil.");
                                            System.out.println("Saldo Anda Sekarang : " + Saldo);
                                        }
                                        break;

                                    case 2:
                                        System.out.print("Masukkan Nomor Tagihan Listrik: ");
                                        int NoListrik = scanner.nextInt();
                                        System.out.print("Masukkan Tagihan Listrik: ");
                                        int TagihanListrik = scanner.nextInt();
                                        if (TagihanListrik >= Saldo) {
                                            System.out.println("Maaf Saldo Anda Tidak Cukup ");
                                        } else {
                                            Saldo -= (TagihanListrik + Admin);
                                            System.out.println("Pembayaran Tagihan Listrik Berhasil.");
                                            System.out.println("Saldo Anda Sekarang : " + Saldo);
                                        }
                                        break;
                                }
                                break;

                            case 3:
                                System.out.print("Masukkan Nomor Tagihan Air: ");
                                int NoAir = scanner.nextInt();
                                System.out.print("Masukkan Tagihan Air: ");
                                int TagihanAir = scanner.nextInt();
                                Saldo -= (TagihanAir + Admin);
                                System.out.println("Pembayaran Tagihan Air Berhasil.");
                                System.out.println("Saldo Anda Sekarang : " + Saldo);
                                break;

                            default:
                                System.out.println("Jenis Pembayaran Tidak Valid");
                                break;
                        }
                        break;

                    case 6:
                        System.out.println("Terima kasih telah menggunakan ATM kami.");
                        lanjut = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            } else {
                System.out.println("PIN salah. Anda memiliki " + (3 - percobaan) + " percobaan tersisa.");
                if (percobaan == 3) {
                    System.out.println("Kartu ATM Anda diblokir.");
                    lanjut = false;
                }
            }
        } while (lanjut);

    }
}