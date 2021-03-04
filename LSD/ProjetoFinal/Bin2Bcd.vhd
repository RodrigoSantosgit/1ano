library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.NUMERIC_STD.all;

entity Bin2BCD is
	port(bin_in  : in std_logic_vector(9 downto 0);
		  bcd_out_0 : out std_logic_vector(3 downto 0);
		  bcd_out_1 : out std_logic_vector(3 downto 0);
		  bcd_out_2 : out std_logic_vector(3 downto 0);
		  bcd_out_3 : out std_logic_vector(3 downto 0));
end Bin2BCD;

architecture BehavProc of Bin2BCD is
	
	constant thousand : unsigned(9 downto 0) := to_unsigned(1000,10);
	constant hundred : unsigned(9 downto 0) := to_unsigned(100,10);
	constant ten : unsigned(9 downto 0) := to_unsigned(10,10);
	
	signal bcd_3 : unsigned(9 downto 0) := unsigned(bin_in) / thousand;
	signal bcd_2 : unsigned(9 downto 0) := unsigned(unsigned(bin_in) rem thousand) / hundred;
	signal bcd_1 : unsigned(9 downto 0) := unsigned((unsigned(bin_in) rem thousand) rem hundred)/ten;
	signal bcd_0 : unsigned(9 downto 0) := unsigned((unsigned(bin_in) rem thousand) rem hundred) rem ten;
	
begin

	bcd_out_3 <= std_logic_vector(bcd_3(3 downto 0));
	bcd_out_2 <= std_logic_vector(bcd_2(3 downto 0));
	bcd_out_1 <= std_logic_vector(bcd_1(3 downto 0));
	bcd_out_0 <= std_logic_vector(bcd_0(3 downto 0));
	
end BehavProc;