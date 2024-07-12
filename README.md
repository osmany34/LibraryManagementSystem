# Kütüphane Yönetim Uygulaması - Veritabanı Yapısı

Bu proje, kütüphane yönetim uygulaması için kullanılan veritabanı yapısını ve tablolar arası ilişkileri açıklamaktadır.

## Tablolar ve Açıklamaları

### 1. Kitaplar Tablosu

![Kitaplar Tablosu](https://github.com/user-attachments/assets/a642c285-ab65-472a-b883-d15d676a41b1)

- **book_id:** Kitapların benzersiz kimliği.
- **name:** Kitabın başlığı.
- **stock:** Kitabın stoğu.
- **publication_year:** Kitabın yayın yılı.
- **publisher_id:** Kitabın yayınevini belirten ID.

### 2. Yazarlar Tablosu

![Yazarlar Tablosu](https://github.com/user-attachments/assets/80307145-c023-498f-96e1-691db5acae18)

- **author_id:** Yazarların benzersiz kimliği.
- **name:** Yazarın adı.
- **birth_year:** Yazarın doğum yılı.

### 3. Kategori Tablosu

![Kategori Tablosu](https://github.com/user-attachments/assets/cf89d112-d8e2-4d76-911d-da46b4b0afe1)

- **category_id:** Kategorilerin benzersiz kimliği.
- **name:** Kategori adı.

### 4. Kitap - Kategori Tablosu

![Kitap - Kategori Tablosu](https://github.com/user-attachments/assets/a279a17e-d19f-412d-9227-fa3852d8db42)

- **book_id:** Kitapların benzersiz kimliği.
- **category_id:** Kategorilerin benzersiz kimliği.

### 5. Yayınevi Tablosu

![Yayınevi Tablosu](https://github.com/user-attachments/assets/763cdca2-ccf4-4c54-be6a-7cea2dd5233a)

- **publisher_id:** Yayınevlerinin benzersiz kimliği.
- **name:** Yayınevi adı.
- **address:** Yayınevinin konumu.

### 6. Kitap Alım Tablosu

![Kitap Alım Tablosu](https://github.com/user-attachments/assets/65434b71-9788-44ea-a966-4d889d8f34e1)

- **borrowing_id:** Alımların benzersiz kimliği.
- **book_id:** Kitapların benzersiz kimliği.
- **borrow_date:** Alım tarihi.
- **return_date:** Dönüş tarihi.

## Tablolar Arası İlişkiler

- **Book - Author (One-to-Many):** Bir kitap bir yazardan yazılır.
- **Book - Category (Many-to-Many):** Bir kitap birden fazla kategoriye ait olabilir; bir kategoriye aynı anda birden fazla kitap ait olabilir.
- **Book - Publisher (One-to-Many):** Bir kitap bir yayınevinden yayımlanır.
- **Book - Borrowing (One-to-Many):** Bir kitap birden fazla kez alınabilir; bir alım yalnızca bir kitaba ait olabilir.
