## Contents:
This folder contains

1. __README.md__

2. __Vagrantfile__ - To set up Ubuntu 14 Desktop virtual machine

3. __vm-contents__ - It contains the files required to build vm

***

## Set-up instructions:

1. Download and install [VirtualBox](https://www.virtualbox.org/).
2. Download and install [Vagrant](http://www.vagrantup.com/).
3. Copy the "Vagrantfile" in this folder to your host OS.
4. Go to the directory which contains the copied Vagrantfile.
5. Run the command "vagrant up --provider virtualbox"
6. The vagrant file will begin execution and boot up a VM after some time.
7. Credentials to login.
  * Username : vagrant
  * Password : vagrant
 
***

## Acknowledgements:
  * Used the base box [box-cutter/ubuntu1404-desktop](https://atlas.hashicorp.com/box-cutter/boxes/ubuntu1404-desktop/versions/2.0.5)
  * Tutorial to install Java in Linux machines can be viewed [here] (https://www.digitalocean.com/community/tutorials/how-to-install-java-on-ubuntu-with-apt-get).
 

***

## References:
* https://atlas.hashicorp.com/box-cutter/boxes/ubuntu1404-desktop/versions/2.0.5
* http://www.sitepoint.com/vagrantfile-explained-setting-provisioning-shell/
* https://docs.vagrantup.com/v2/getting-started/index.html

