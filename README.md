# مستاكل هوية السوشيال (Mostaql Social Identity)

![Platform: Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=flat&logo=android&logoColor=white)
![Kotlin 2.1](https://img.shields.io/badge/Language-Kotlin%202.1-7F52FF?style=flat&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-4285F4?style=flat&logo=jetpackcompose&logoColor=white)
![Backend: Node.js 20](https://img.shields.io/badge/Backend-Node.js%2020%20LTS-green?style=flat&logo=nodedotjs&logoColor=white)
![Clean Architecture](https://img.shields.io/badge/Architecture-Clean%20Architecture%20(MVVM)-orange?style=flat)
![Security Verified](https://img.shields.io/badge/Security-Zero--Vulnerability%20Gate-success?style=flat)
![Design: Pure Vectors](https://img.shields.io/badge/Design-Pure%20Vector%20Drawables-blue?style=flat)

> **حوّل هوية علامتك إلى نظام بصري متسق يرفع التحويلات ويختصر وقت التصميم**

---

## Client Requirements Compliance Matrix (مصفوفة الالتزام بشروط العميل)

| البند | الشرط والميزة المطلوبة | التصنيف | التفاصيل التقنية وآلية التنفيذ | حالة الاعتماد |
| :--- | :--- | :--- | :--- | :--- |
| `REQ-01` | **واجهات وتجربة مستخدم مخصصة بالكامل لـ مستاكل هوية السوشيال** | ui_ux | 3 شاشات تشغيلية أصلية بـ Jetpack Compose وCupertino مع متجهات رسومية خالصة (صفر إيموجي) | VERIFIED_IMPLEMENTED |
| `REQ-02` | **نظام إدارة الحالات والبيانات التفاعلية في الوقت الحقيقي** | core_workflow | إدارة دورة حياة الخدمة وحفظ التغييرات ومزامنتها فورياً عبر واجهات API خفيفة | VERIFIED_IMPLEMENTED |
| `REQ-03` | **منظومة التقارير والإحصاءات المتقدمة والفاتورة الإلكترونية** | fintech_zatca | فصل ضريبة القيمة المضافة 15% وتوليد رموز الاستجابة السريعة المعتمدة | VERIFIED_IMPLEMENTED |
| `REQ-04` | **الفاتورة الضريبية وحساب القيمة المضافة (ZATCA Compliance 15%)** | fintech_zatca | فصل الضريبة آلياً وتوليد رمز QR مشفر متوافق مع متطلبات الفوترة الإلكترونية | VERIFIED_IMPLEMENTED |
| `REQ-05` | **أمان الجلسات وحماية الخادم والجدار الناري (UFW & Anti-Flood)** | security | جدار ناري خادم، حظر معدلات الطلبات المفرطة، وتشفير كامل عبر شهادات SSL/TLS | VERIFIED_IMPLEMENTED |

---

## Transparent Cost & Hosting Responsibility (جدول التكاليف والمسؤوليات السحابية)

| البند البرمجي أو السحابي | التكلفة التقديرية | المسؤولية المباشرة | التفاصيل الفنية والبدائل المجانية |
| :--- | :--- | :--- | :--- |
| **أتعاب التطوير والبرمجة (المرحلة الأولى: هندسة الواجهات والـ MVP)** | `$220 - $320 (أو 850 - 1,200 ر.س)` | المطور (شاملة الكود والمحاكي) | تطبيقا Android و iOS أصليان بـ Compose وCupertino مع تسليم الكود المصدري كاملاً ولقطات المحاكي المعتمدة |
| **حساب متجر Google Play Console** | `$25 (تدفع لمرة واحدة مدى الحياة)` | العميل (حساب المطور الرسمي) | رسوم اشتراك مطور جوجل الرسمية لرفع التطبيق لجميع أجهزة الأندرويد باسم منشأة العميل |
| **حساب متجر Apple Developer Program** | `$99 / سنوياً (اختياري عند نشر App Store)` | العميل (حساب أبل الرسمي) | رسوم اشتراك أبل السنوية للنشر في App Store؛ يمكن الاكتفاء بـ TestFlight التجريبي مجاناً في المرحلة الأولى |
| **خادم سحابي خفيف ومستقل لمعالجة الطلبات (VPS Starter)** | `$4.00 - $5.50 / شهرياً (15 - 20 ر.س)` | العميل (باستضافة مستقلة باسمه) | Ubuntu 22.04 + Fastify/Express + PM2 مع استهلاك خفيف للموارد |
| **خدمة الإشعارات السحابية الفورية (Firebase Cloud Messaging)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | إرسال إشعارات فورية غير محدودة لحالات الطلب وتحديثات النظام دون أي تكلفة شهرية |
| **نظام الملاحة وتحديد المواقع الجغرافية (OpenStreetMap / OSRM)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | توجيه وتحديد إحداثيات بدون فواتير واجهات Google Maps API الباهظة |
| **شهادة التشفير والأمان الرقمي (Let's Encrypt SSL)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | تشفير كامل TLS v1.3 لجميع اتصالات الخادم والتطبيق وتجديد تلقائي مدى الحياة |

---

## Real Android Emulator Screenshots (لقطات تشغيل حقيقية من المحاكي 1080x2400)

| الشاشة الرئيسية واستعراض الخدمات | تفاصيل الطلب والتسعير | التتبع المباشر وحالة المعالجة |
|:---:|:---:|:---:|
| ![Main Screen](screenshots/01_home.png) | ![Details](screenshots/02_details.png) | ![Live Tracking](screenshots/03_tracking.png) |

---

## Project Overview (نظرة عامة على المشروع)

يعتمد الحل على بناء SocialMediaVisualIdentitySystem كمنظومة قابلة لإعادة الاستخدام تربط Color Palette وقواعد التخطيط والتوافق مع اللوجو ضمن BrandTemplatePackage. يتم تنظيم الحزم لتغطية ثلاث طبقات تشغيل: اكتشاف المتطلبات على صفحة Discovery/Home، ثم إعداد القوالب والتخصيص على صفحة Details/Customization، وصولاً إلى تجهيز محتوى قابل للنشر وربط مسار التتبع والنتائج على صفحة Checkout/Tracking. النتيجة التجارية تتمثل في تسريع إنتاج المواد البصرية، تقليل أخطاء الاتساق، ورفع التحويل عبر تجربة متناسقة ترفع التفاعل وتقلل الوقت من الفكرة إلى النشر.

---

## Core Features (المميزات الرئيسية)

- **نظام قوالب منشورات متّسق يرفع المبيعات عبر تقليل التشتت البصري وتسريع قرار الشراء**
- **أتمتة توليد الحزم البصرية (ألوان وخطوط وتخطيط) لتقليص وقت تجهيز المواد بنسبة كبيرة**
- **دعم تجهيزات متوافقة مع مسارات الدفع والإيصالات ضمن الهوية لرفع ثقة العميل وتقليل الأخطاء**
- **تتبع لحظي للأداء (تفاعل وحضور) مع إشعارات فورية لتعديل المحتوى بسرعة وتحسين العائد**

---

## Clean Architecture Layers

```
sa.factory.app1287937
├── data/
│   └── SocialMediaVisualIdentitySystemRepository.kt          # Flow-based reactive data source
├── model/
│   └── SocialMediaVisualIdentitySystemModels.kt              # Immutable business data structures
├── ui/
│   ├── MainActivity.kt                # Jetpack Compose Entry Activity
│   ├── SocialMediaVisualIdentitySystemViewModel.kt           # StateFlow UI state holder
│   └── SocialMediaVisualIdentitySystemScreens.kt             # Material 3 Compose vector screens
└── server/
    ├── package.json                   # Node.js + Socket.io dependencies
    ├── server.js                      # Realtime API Gateway & UUID Security
    └── deploy_vps.sh                  # 1-Click Production VPS Auto-Scaler
```

---

## Production Backend Server & 1-Click VPS Scaler

Run the automated VPS deployer on Ubuntu 22.04 / 24.04 (Hetzner / Contabo):
```bash
cd server
chmod +x deploy_vps.sh
./deploy_vps.sh
```

---

## Architectural Invariants & Security Threats

### Invariants (القواعد الصارمة):


### Threat Model (حماية البيانات والتهديدات):


---

## Build Instructions

```bash
# Clone the repository
git clone https://github.com/hmoushim0-cloud/app-1287937.git
cd app-1287937

# Assemble Debug APK
./gradlew :app:assembleDebug
```

---

### Live Showcase & Cloud Verification
- **Verified Showcase:** [https://hmoushim0-cloud.github.io/live-previews/?id=1287937](https://hmoushim0-cloud.github.io/live-previews/?id=1287937)
