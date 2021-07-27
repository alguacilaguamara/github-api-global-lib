def call(String app) {
  sh "sudo apt update && sudo apt install ${app}"
}
