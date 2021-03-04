library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.NUMERIC_STD.all;

entity Bin2BCD is
	port(bin_in  : in std_logic_vector(5 downto 0);
		  bcd_out_0 : out std_logic_vector(3 downto 0);
		  bcd_out_1 : out std_logic_vector(3 downto 0));
end Bin2BCD;

architecture BehavProc of Bin2BCD is

	constant ten : unsigned(3 downto 0) := to_unsigned(10,4);
	signal bin_1 : unsigned(5 downto 0) := unsigned(bin_in) / ten;
	signal bin_0 : unsigned(3 downto 0) := unsigned(bin_in) rem ten;
begin

	bcd_out_0 <= std_logic_vector(bin_0);
	bcd_out_1 <= std_logic_vector(bin_1(3 downto 0));
	
end BehavProc;