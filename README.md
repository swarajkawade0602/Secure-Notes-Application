# 📌 Secure Notes Application

A full-stack secure notes application with **Spring Boot**, **JWT Authentication**, **Two-Factor Authentication (TOTP)**, and a modern **React UI**.  
This project allows users to securely store personal notes with strong authentication and encryption practices.

---

## 🚀 Features

### 🔐 Authentication
- User Registration & Login  
- JWT-based Authentication  
- Refresh Token Support  
- Two-Factor Authentication (TOTP – Google Authenticator)  
- Password Hashing using BCrypt  

### 📝 Notes Module
- Create Note  
- Edit Note  
- Delete Note  
- View All Notes  
- Notes linked to logged-in user  

### 🛡️ Security
- Spring Security 6  
- Role-based access control  
- TOTP Secret generation  
- QR Code for Google Authenticator  
- Backup logic for disabled 2FA users  

### 🎨 Frontend
- React (Vite or CRA depending on setup)  
- Axios for API calls  
- JWT storage & interceptor  
- Protected Routes  
- Modern UI  

---

## 📂 Project Structure

Secure Notes Application
 ├── Secure Notes Backend/       # Spring Boot API
 └── Secure Notes Frontend/      # React Application

---

# ⚙️ Backend (Spring Boot) Setup

### 📌 Navigate to backend folder
cd "Secure Notes Backend"

### ▶️ Start the backend
mvn spring-boot:run

Backend runs at:
http://localhost:8080

---

# 💻 Frontend (React) Setup

### 📌 Navigate to frontend folder
cd "Secure Notes Frontend"

### 📦 Install dependencies
npm install

### ▶️ Start frontend
npm run dev

Frontend runs at:
http://localhost:5173

---

# 🔗 Connecting Frontend & Backend

Update the frontend API base URL  
/src/api/axios.js:

export default axios.create({
  baseURL: "http://localhost:8080",
});

---

# 🔐 Enabling Two-Factor Authentication (TOTP)

1. Login with username + password  
2. Go to Security Settings → Enable 2FA  
3. Backend generates:
   - Secret key  
   - QR code  
4. Scan QR code using Google Authenticator  
5. Enter the 6-digit OTP to verify  
6. From next login → OTP required  

---

# 🛠️ Tech Stack

### Backend
- Java 17  
- Spring Boot  
- Spring Security  
- JWT  
- Maven  
- Google Authenticator TOTP  
- MySQL/PostgreSQL  

### Frontend
- React  
- Vite  
- Axios  
- React Router  
- Tailwind CSS (optional)

---

# 🤝 Contributing

Feel free to open issues or submit pull requests.  
Suggestions and improvements are welcome!

---

# 📜 License

This project is licensed under the MIT License.
