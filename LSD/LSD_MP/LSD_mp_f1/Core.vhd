library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.NUMERIC_STD.ALL;

Entity Core is
	port( clk: in std_logic;
			start : in std_logic;
			reset: in std_logic;
			min_out : out std_logic_vector(5 downto 0);
			seg_out : out std_logic_vector(5 downto 0);
			finish : out std_logic);
end Core;

architecture RTL of Core is

	signal seg : unsigned(5 downto 0) :=to_unsigned(59,6);
	signal min : unsigned(5 downto 0) :=to_unsigned(59,6);
	
begin

	process(reset, clk, start)
	begin

		if(reset='0') then
			seg <= to_unsigned(59,6);
			min <= to_unsigned(59,6);
		else
			if(start = '1') then
				if(rising_edge(clk)) then
					if(seg = "000000")	then
						if(min = "000000") then
							finish <= '1';
						else
							finish <= '0';
							seg <= to_unsigned(59,6);
							min <= unsigned(min) - 1;
						end if;
						
					else
						seg <= unsigned(seg) - 1;
					end if;
					
					
				end if;
			end if;
		end if;
		
		seg_out <= std_logic_vector(seg);
		min_out <= std_logic_vector(min);
		
	end process;
end RTL;			

