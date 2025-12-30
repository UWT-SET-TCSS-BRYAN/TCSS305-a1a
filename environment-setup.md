# Environment Setup

**TCSS 305 – Winter 2026**

> [!IMPORTANT]
> If you intend to use your own computer, first install the current version of the Java Development Kit (JDK) as described below. After installing the JDK, install JetBrains IntelliJ and plugins.

## ☕ Install the Java Development Kit (JDK)

> 🔗 **Download:** [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/)

The site offers JDK 21 and **JDK 25**. Please use the latest **Long-Term Support (LTS)** version (**JDK 25**).

Download the JDK version appropriate for your operating system. There are tabs on the download page for selecting your operating system (Linux, macOS, or Windows). If you scroll to the bottom of the download page there is a link to installation instructions — refer to those if you have questions or issues during installation.

### Linux

> [!TIP]
> 📖 **Research:** [JDK Installation on Linux](https://docs.oracle.com/en/java/javase/25/install/installation-jdk-linux-platforms.html#GUID-737A84E4-2EFF-4D38-8E60-3E29D1B884B8)

### macOS

Ensure you download the correct version for your hardware architecture:
- Older Intel processor-based Macs: **x64 DMG Installer**
- Newer Apple M1/M2/M3/M4/M5 processor-based Macs: **ARM64 DMG Installer**

> [!TIP]
> To check your Mac's processor, click the Apple menu → **About This Mac**. Look for "Chip" (Apple Silicon) or "Processor" (Intel).

> [!TIP]
> 📖 **Research:** [JDK Installation on macOS](https://docs.oracle.com/en/java/javase/25/install/installation-jdk-macos.html#GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE)

### Windows

If you wish to compile and run Java programs from the command line:

1. During installation, note the location where the Java files are installed. Typically the default is something like: `C:\Program Files\Java\jdk-25`

2. Set the **PATH** environment variable:
    1. Open Windows System Settings and then the Environment Variables dialog.
    2. Add the location of the `bin` folder of the JDK installation to the PATH variable in the System Variables section.
    3. Typical value to add: `C:\Program Files\Java\jdk-25\bin`

3. Set the **JAVA_HOME** environment variable:
    1. Under System Variables, click New.
    2. Enter the variable name as `JAVA_HOME`.
    3. Enter the variable value as the installation path of the JDK (without the bin sub-folder).
    4. Click OK.

> [!TIP]
> 📖 **Research:** [JDK Installation on Windows](https://docs.oracle.com/en/java/javase/25/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA)

## 🚀 Install JetBrains IntelliJ

> 🔗 **Student License:** [JetBrains Free Educational License](https://www.jetbrains.com/shop/eform/students)

1. Sign up for your free student license for JetBrains products using the link above.

2. Once completed with the sign-up process, download and install **IntelliJ IDEA Ultimate**. Follow the posted instructions to complete the installation.

3. Install the following plugins:
    - **Checkstyle-IDEA** (Required)
    - **Grep Console** (Optional)

> [!TIP]
> 📖 **Research:** [Plugin Installation Instructions](https://www.jetbrains.com/help/idea/managing-plugins.html)

## 🐱 GitHub Registration

> 🔗 **Sign Up:** [GitHub](https://github.com/)

1. Sign up for a GitHub account using your official UW email.

> [!IMPORTANT]
> If you already have a personal GitHub account, please register a new one using your official UW email.

2. Sign up for the GitHub Student Developer Pack (Optional)

> 🔗 **Student Pack:** [GitHub Student Developer Pack](https://education.github.com/pack)