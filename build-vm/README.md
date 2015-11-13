## Contents:
This folder contains

1. __Vagrantfile__ - To set up Ubuntu 14 Desktop virtual machine

***

## Set-up instructions:

1. Download and install [VirtualBox](https://www.virtualbox.org/).
2. Download and install [Vagrant](http://www.vagrantup.com/).
3. Clone this repo and `cd` into the directory. 
  * git clone https://github.com/SoftwareEngineeringToolDemos/FSE-2013-RADA.git FSE-2013-RADA
  * cd FSE-2013-RADA/build-vm
4. Run `vagrant up` to set up the virtual machine.
5. The vagrant file will begin execution and boot up a VM after some time.
6. Credentials to login.
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

