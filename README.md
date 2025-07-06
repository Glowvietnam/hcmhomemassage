# HomeMassageApp

Ứng dụng Android viết bằng Kotlin cho phép người dùng:
- Xem danh sách kỹ thuật viên massage tại nhà.
- Xem thông tin chi tiết, kỹ năng, đánh giá.
- Đặt lịch massage.

## Công nghệ sử dụng
- Kotlin
- Jetpack Compose
- MVVM Architecture

## Cấu trúc thư mục
- `data/model`: Các class dữ liệu như Technician, Booking.
- `data/repository`: Lớp giả lập truy cập dữ liệu.
- `viewmodel`: Quản lý logic và dữ liệu cho UI.
- `ui`: Compose UI gồm các màn hình và component.

## Hướng dẫn chạy project
1. Clone repo.
2. Mở bằng Android Studio.
3. Chạy trên thiết bị/emulator.

> Đây là bản demo mẫu. Có thể mở rộng bằng cách thêm Room DB, Retrofit API, Firebase Auth và các tính năng thanh toán.