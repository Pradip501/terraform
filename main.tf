# key pair
provider "aws" {
  region     = "us-east-2"
}

resource "aws_key_pair" "key" {
  key_name   = "id_rsa"
  public_key = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIF+Z2eFOblqA0yKfFxuKQrEVV7jeyGEdISCMNqoUP72t pradip@DESKTOP-G65PCJL"
}
