import csv

# Data kontak
data_kontak = [
    [1, "Akbar", "081231334412", "Teman"],
    [2, "Akbar", "082211123212", "Keluarga"],
    [3, "Agus", "0912313213122", "Keluarga"],
    [4, "John Doe", "1234567890", "Keluarga"],
    [5, "Jane Doe", "9876543210", "Teman"],
    [6, "Alex Brown", "5556667777", "Kerja"],
]

# Path untuk menyimpan file CSV
file_path = r"C:\Users\SSD TURBO_BC\Documents\NetBeansProjects\TugasPbo\src\Latihan3\importkontak.csv"

# Membuat file CSV sesuai format tabel
try:
    with open(file_path, "w", newline="", encoding="utf-8") as file:
        writer = csv.writer(file, delimiter=',')
        # Menulis header
        writer.writerow(["ID", "Nama", "Nomor Telepon", "Kategori"])
        # Menulis data
        writer.writerows(data_kontak)
    print(f"File CSV berhasil disimpan di: {file_path}")
except Exception as e:
    print(f"Terjadi kesalahan: {e}")
