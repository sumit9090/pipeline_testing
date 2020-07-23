node{
stage('SCM Checkout')
{
git 'https://github.com/sumit9090/pipeline_testing'
}
stage('Compile-Package')
{
  def myvar=  tool name: 'M2_HOME', type: 'maven'

  sh "${myvar}/bin/mvn package"
}
}
