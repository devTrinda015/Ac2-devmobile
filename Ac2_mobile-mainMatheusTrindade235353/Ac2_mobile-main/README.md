# 📱 Aplicativo de Controle de Uso de Medicamentos

Este é um aplicativo Android desenvolvido com Android Studio para auxiliar usuários a registrarem, organizarem e receberem lembretes sobre os horários de consumo de seus medicamentos.

## 📌 Funcionalidades

- ✅ Cadastro, edição e exclusão de medicamentos
- ⏰ Definição de horário de consumo
- 📋 Listagem dos medicamentos na tela principal
- 📦 Persistência dos dados com SQLite
- 🔔 Marcação de medicamentos como "consumidos"
- 🌍 Internacionalização (Português e Espanhol)
- 🚨 Planejamento para implementação de lembretes (AlarmManager)

## 🛠 Tecnologias Utilizadas

- Java
- Android SDK
- SQLite (via `SQLiteOpenHelper`)
- RecyclerView
- Internationalization (i18n)

## 📂 Estrutura de Pastas

```
app/
├── java/com/seunome/controlemedicamentos/
│   ├── MainActivity.java
│   ├── AddEditMedicamentoActivity.java
│   ├── adapter/
│   │   └── MedicamentoAdapter.java
│   ├── database/
│   │   └── MedicamentoDbHelper.java
│   └── model/
│       └── Medicamento.java
├── res/
│   ├── layout/
│   │   ├── activity_main.xml
│   │   ├── activity_add_edit_medicamento.xml
│   │   └── item_medicamento.xml
│   ├── values/strings.xml
│   └── values-es/strings.xml
```

## 🚀 Como rodar o projeto

1. Clone ou baixe o projeto
2. Abra o Android Studio e selecione **Open an existing project**
3. Conecte um emulador ou dispositivo físico com depuração USB ativada
4. Clique em **Run** (`Shift + F10`)

## 👨‍💻 Autor

- Nome: Fábio Rodrigues da Silva Filho
- Ra: 236075
- Link do GitHub: https://github.com/Fabio-2004-Rodrigues/Ac2_mobile
- Projeto acadêmico da atividade AC2
