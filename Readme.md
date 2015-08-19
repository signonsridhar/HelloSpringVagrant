Deploying Web Application Using Vagrant https://dzone.com/articles/vagrant

Synchronize multiple folders http://0-proquest.safaribooksonline.com.catalog.sjlibrary.org/book/software-engineering-and-development/9781484200735/chapter-3-the-states-of-vm/sec19_html_2?query=((pro+vagrant))#X2ludGVybmFsX0h0bWxWaWV3P3htbGlkPTk3ODE0ODQyMDA3MzUlMkZzZWMyMF9odG1sXzUmcXVlcnk9c3luY2VkJTIwZm9sZGVycw==
Vagrant.configure(2) do |config|
  config.vm.box = "hashicorp/precise32"
  config.vm.synced_folder "./target/HelloSpring", "/var/lib/tomcat7/webapps/HelloSpring"
  config.vm.synced_folder "./some/dir/second", "/second", create: true
end
The sync_folder has the following parameters:
create: If the host’s directory doesn’t exist it will be created (defaults to false)
disabled: Should the synchronization be turned on? (defaults to true)
group: Group of the guest’s directory (defaults to ssh user)
owner: Owner of the guest’s directory (defaults to ssh user)
type and mount_options: Define the method of synchronization

#set JAVA_HOME
cd /etc/default/
vi tomcat7  # search JAVA_HOME
JAVA_HOME=/usr/lib/jvm/java-7-oracle

#if tomcat not running
sudo servie tomcat7 restart

# Launch site
http://192.168.33.10:8080/HelloSpring/
http://192.168.33.10:8080/HelloSpring/welcome

# To commit changes to git
$ git config --global user.name "sridhar jallapuram"
$ git config --global user.email signonsridhar@gmail.com


