package org.mycompany.pipeline

class Helper {
  static void echo(String message) {
        println message
    }
  static void build(String Name) {
    echo "Building project : ${Name}"
  }
}
