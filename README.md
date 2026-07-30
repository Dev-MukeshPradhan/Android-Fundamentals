Android-Fundamentals

A collection of small, focused Android projects — one module per fundamental concept. Each module is a standalone runnable app that demonstrates a specific topic.

This repo is structured as a multi-module Gradle project: clone once, open in Android Studio, and switch between modules using the run configuration dropdown at the top.

Modules
Module	Topic	Status
fragments-demo	Fragment transactions, adding/replacing fragments	✅ Completed
permissions-demo	Runtime permission requests	🔜 Coming up
intents-demo	Explicit & implicit intents, intent filters	🔜 Planned

Update this table as new modules are added — one row per topic.

Project Structure
Android-Fundamentals/
├── fragments-demo/     # Fragment transactions
├── permissions-demo/   # Runtime permissions
├── settings.gradle.kts # Registers all modules
└── build.gradle.kts    # Root-level build config
Getting Started
Clone the repo:
bash
   git clone https://github.com/Dev-MukeshPradhan/Android-Fundamentals.git
Open the root folder in Android Studio.
Let Gradle sync — all modules will load.
Pick a module from the run configuration dropdown (top toolbar) and hit Run.
Adding a New Topic
File > New > New Module > Phone & Tablet App in Android Studio.
Name it <topic>-demo.
Android Studio auto-registers it in settings.gradle.kts.
Add a row to the table above.
Why Multi-Module?

Keeping every fundamental as its own module (instead of one giant app) means:

Each topic stays isolated and easy to navigate.
You can run/debug one concept without noise from the others.
The repo doubles as a reference library as it grows.
